# DragListView
you just drag the item in the listview to change the position with each other
# Usage   
1、just include DragListView in your layout xml.  
` <com.czl.struct.widget.DragListView   
  android:id="@+id/dragLvi"   
  android:layout_width="fill_parent"   
  android:layout_height="fill_parent"  
  android:background="#FFFFFF"   
  android:cacheColorHint="@android:color/transparent"   
  android:divider="#DCD7CF"  
  android:dividerHeight="1dp"  
  android:fadingEdgeLength="0dip"  
  android:focusable="false"   
  android:focusableInTouchMode="false"   
  android:listSelector="@android:color/transparent"   
  android:scrollbars="vertical"   
  android:typeface="sans" /> `  
  
2、In your onCreate method (or onCreateView for a fragment),just use it like this:  
` dragListView = (DragListView) findViewById(R.id.dragLvi);  
  dragListView.setDragImageSourceId(R.id.imageView1);
  dragListView.setDragItemChangeListener(this);   `  
3、implements the DragItemChangeListener interface by overriding method followed:  
 `@Override  
  public void onDragItemChange(int dragSrcPosition, int dragPosition) {  
  
  }` 
  


