/*
 * 项目名:      农夫山泉小瓶水系统
 * 文件名:      DragItemChangeListener.java
 * 类名:        DragItemChangeListener
 *
 * 版权声明:
 *      本系统的所有内容，包括源码、页面设计，文字、图像以及其他任何信息，
 *      如未经特殊说明，其版权均属农夫山泉股份有限公司所有。
 *
 *      Copyright (c) 2013 农夫山泉股份有限公司
 *      版权所有
 */
package com.czl.struct.interfaces;

/**
 * 类名:		DragItemChangeListener
 * 描述:		拖拽
 * @author 	ziluncao
 *
 */
public interface DragItemChangeListener {
    public void onDragItemChange(int dragSrcPosition,int dragPosition);
}
