package com.tabdemo.designpattern.abs_factory;

import android.util.Log;

public class Battery1000ma implements component.Battery {

    private static final String TAG = "Battery1000ma";
    @Override
    public void showBatteryName() {
        Log.d(TAG, "showBatteryName: battery is 1000ma");
    }
}
