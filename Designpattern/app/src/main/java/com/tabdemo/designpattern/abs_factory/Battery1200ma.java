package com.tabdemo.designpattern.abs_factory;

import android.util.Log;

public class Battery1200ma implements component.Battery {
    private static final String TAG = "Battery1200ma";
    @Override
    public void showBatteryName() {
        Log.d(TAG, "showBatteryName: battery is 1200ma");
    }
}
