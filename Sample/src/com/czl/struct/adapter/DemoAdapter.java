/*
 * 项目名:      农夫山泉小瓶水系统
 * 文件名:      aaa.java
 * 类名:        aaa
 *
 * 版权声明:
 *      本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *      如未经特殊说明，其版权均属农夫山泉股份有限公司所有。
 *
 *      Copyright (c) 2013 农夫山泉股份有限公司
 *      版权所有
 */
package com.czl.struct.adapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.czl.struct.R;

/**
 * 类名:		DemoAdapter
 * 描述:		列表适配器
 * @author ziluncao
 */
public class DemoAdapter extends BaseAdapter {
    private WeakHashMap<Integer, View>         cache = new WeakHashMap<Integer, View>();

    @SuppressWarnings("unused")
    private Context                            mcontext;

    private ArrayList<HashMap<String, Object>> mdata;

    private LayoutInflater                     mInflater;

    @SuppressWarnings("static-access")
    public DemoAdapter(Context mcontext, ArrayList<HashMap<String, Object>> list) {
        super();
        this.mcontext = mcontext;
        this.mdata = list;
        this.mInflater = (LayoutInflater) mcontext.getSystemService(mcontext.LAYOUT_INFLATER_SERVICE);
    }

    public int getCount() {
        return mdata.size();
    }

    public Object getItem(int position) {
        return mdata.get(position);
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = cache.get(position);
        ViewDemoHolder holder;
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.item, null);
            holder = new ViewDemoHolder();
            holder.numbTV = (TextView) convertView.findViewById(R.id.numbTV);
            holder.adrTv = (TextView) convertView.findViewById(R.id.adrTv);
            holder.timeTv = (TextView) convertView.findViewById(R.id.timeTv);
            holder.callTv = (TextView) convertView.findViewById(R.id.callTv);
            holder.imageView1 = (ImageView) convertView.findViewById(R.id.imageView1);
            convertView.setTag(holder);
        } else {
            holder = (ViewDemoHolder) convertView.getTag();
        }
        if (0 == position % 2) {
            convertView.setBackgroundResource(R.color.back);
        } else {
            convertView.setBackgroundResource(R.color.graptransparent);
        }
        holder.numbTV.setText(mdata.get(position).get("numbTV").toString());
        holder.adrTv.setText(mdata.get(position).get("adrTv").toString());
        holder.timeTv.setText(mdata.get(position).get("timeTv").toString());
        holder.callTv.setText(mdata.get(position).get("callTv").toString());
        cache.put(position, convertView);
        return convertView;
    }

    class ViewDemoHolder {
        TextView  numbTV;

        TextView  adrTv;

        TextView  timeTv;

        TextView  callTv;

        ImageView imageView1;
    }

}
