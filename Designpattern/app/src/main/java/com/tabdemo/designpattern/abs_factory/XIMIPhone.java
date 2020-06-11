package com.tabdemo.designpattern.abs_factory;

public class XIMIPhone extends Factory {
    @Override
    public component.Cpu createCPU() {
        return new A9();
    }

    @Override
    public component.Battery createBattery() {
        return new Battery1000ma();
    }
}
