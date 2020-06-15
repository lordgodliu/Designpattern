package com.tabdemo.designpattern.factory;

public class MyFactory extends Factory {
    @Override
    public Product CreateProduct(int tag) {
        if (tag==1){
            return new ConA();
        }else {
            return new ConB();
        }

    }
}
