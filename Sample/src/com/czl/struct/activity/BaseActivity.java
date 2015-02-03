package com.czl.struct.activity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Message;

/**
 * 类名:		BaseActivity
 * 描述:		基类
 * @author 	ziluncao
 *
 */
public abstract class BaseActivity extends Activity {
      
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public abstract void init();

    public abstract void findViewById();

    public abstract void Message(Message msg);

    @Override
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
    }
}
