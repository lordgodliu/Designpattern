package com.tabdemo.designpattern.abs_factory;

public interface component {

    public interface Cpu{
        void showCpuName();
    }

    public interface Battery{
        void showBatteryName();
    }
}
