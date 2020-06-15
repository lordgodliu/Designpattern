package com.tabdemo.designpattern.abs_factory;

import android.util.Log;

public class A9 implements component.Cpu {

    private static final String TAG = "A9";
    @Override
    public void showCpuName() {
        Log.d(TAG, "showCpuName: A9");
    }
}



