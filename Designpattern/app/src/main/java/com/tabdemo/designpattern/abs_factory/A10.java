package com.tabdemo.designpattern.abs_factory;

import android.util.Log;

public class A10 implements component.Cpu {

    @Override
    public void showCpuName() {
        Log.d("AbstractFactory","A10");
    }
}
