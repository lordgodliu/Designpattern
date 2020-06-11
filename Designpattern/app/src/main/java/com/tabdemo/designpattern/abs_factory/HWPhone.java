package com.tabdemo.designpattern.abs_factory;

public class HWPhone extends Factory {
    @Override
    public component.Cpu createCPU() {
        return new A10();
    }

    @Override
    public component.Battery createBattery() {
        return new Battery1200ma();
    }
}
