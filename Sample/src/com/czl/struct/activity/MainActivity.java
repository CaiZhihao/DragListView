package com.czl.struct.activity;

import java.util.ArrayList;
import java.util.HashMap;

import android.os.Bundle;
import android.view.Menu;

import com.czl.struct.R;
import com.czl.struct.adapter.DemoAdapter;
import com.czl.struct.interfaces.DragItemChangeListener;
import com.czl.struct.widget.DragListView;

public class MainActivity extends BaseActivity implements DragItemChangeListener{

    private DragListView                       dragListView;

    private ArrayList<HashMap<String, Object>> list;

    private DemoAdapter                        demoAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        findViewById();
    }

    @Override
    public void init() {
        list = new ArrayList<HashMap<String, Object>>();
        for (int i = 0; i < 20; i++) {
            HashMap<String, Object> map = new HashMap<String, Object>();
            map.put("numbTV", "D138026594664912200" + i);
            map.put("adrTv", "浙江省杭州市西湖区小和山");
            map.put("timeTv", "2013-09-27 15:23");
            map.put("callTv", "18778900578");
            list.add(map);
        }
    }

    @Override
    public void findViewById() {
        dragListView = (DragListView) findViewById(R.id.dragLvi);
        demoAdapter = new DemoAdapter(MainActivity.this, list);
        dragListView.setAdapter(demoAdapter);
        dragListView.setDragImageSourceId(R.id.imageView1);
        dragListView.setDragItemChangeListener(this);

    }

    @Override
    public void Message(android.os.Message msg) {

    }

    @Override
    public void onDragItemChange(int dragSrcPosition, int dragPosition) {
        HashMap<String, Object> map = list.get(dragSrcPosition);
        list.remove(dragSrcPosition);
        list.add(dragPosition, map);
        demoAdapter.notifyDataSetChanged();
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
