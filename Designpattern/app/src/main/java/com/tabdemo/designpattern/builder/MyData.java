package com.tabdemo.designpattern.builder;

public class MyData {
    private int id;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name+id;
    }
}
