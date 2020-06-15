package com.tabdemo.designpattern.abs_factory;

import android.util.Log;

public class A10 implements component.Cpu {
    private static final String TAG = "A10";
    @Override
    public void showCpuName() {
        Log.d(TAG, "showCpuName: A10");
    }
}
