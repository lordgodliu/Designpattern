package com.tabdemo.designpattern.abs_factory;

public abstract class Factory {

    public abstract component.Cpu createCPU();
    public abstract component.Battery createBattery();
}
