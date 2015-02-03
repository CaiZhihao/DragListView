DragListView
==========================

Just drag the item in listview to switch the position with each other.

Usage
=====

*For a working implementation of this project see the `sample/` folder.*

  1. Include one of the widgets in your view. This should usually be placed
     adjacent to the `ViewPager` it represents.

        <com.czl.struct.widget.DragListView
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
            android:typeface="sans" />

  2. In your `onCreate` method (or `onCreateView` for a fragment), just use
     it like below code.
         dragListView = (DragListView) findViewById(R.id.dragLvi);
         dragListView.setDragImageSourceId(R.id.imageView1);
         dragListView.setDragItemChangeListener(this);

  3.implements DragItemChangeListener
     overriding onDragItemChange() method

         //continued from above
         public void onDragItemChange(int dragSrcPosition, int dragPosition) {}

Developed By
============

 * GankLun 

License
=======

    Copyright 2015 Jake Wharton.
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.


  


