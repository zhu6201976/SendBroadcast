package com.example.administrator.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


/**
 * 发送一条自定义无序广播
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    // 点击按钮,发送一条自定义无序广播
    public void sendBroadcast(View view) {
        sendBroadcast(new Intent("android.intent.action.ACTION_MY"));
    }

}
