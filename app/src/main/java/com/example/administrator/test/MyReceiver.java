package com.example.administrator.test;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * MyReceiver
 * Created by My on 2017/12/11.
 */

public class MyReceiver extends BroadcastReceiver {
    private static final String TAG = "MyReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, "onReceive: 接收到了发送过来的自定义广播");
        Toast.makeText(context, "接收到了发送过来的自定义广播", Toast.LENGTH_SHORT).show();
    }
}
