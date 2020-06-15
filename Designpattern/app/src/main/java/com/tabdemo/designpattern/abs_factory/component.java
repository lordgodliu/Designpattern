package com.tabdemo.designpattern.abs_factory;

public interface component {

     interface Cpu{
        void showCpuName();
    }

     interface Battery{
        void showBatteryName();
    }
}
