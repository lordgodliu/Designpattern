package com.tabdemo.designpattern.abs_factory;

import android.util.Log;

public class Battery1200ma implements component.Battery {
    @Override
    public void showBatteryName() {
        Log.d("AbstractFactory","battery is 1200ma");
    }
}
