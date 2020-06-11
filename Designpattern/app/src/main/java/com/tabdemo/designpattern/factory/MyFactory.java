package com.tabdemo.designpattern.factory;

public class MyFactory extends Factory {
    @Override
    public Product CreateProduct() {
        return new ConA();
    }
}
