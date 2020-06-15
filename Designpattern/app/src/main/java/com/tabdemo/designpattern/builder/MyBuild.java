package com.tabdemo.designpattern.builder;

public class MyBuild {

    private int id;
    private String name;
    public MyData build(){
        MyData data = new MyData();
        data.setId(id);
        data.setName(name);
        return data;
    }

    public MyBuild setId(int id) {
        this.id = id;
        return this;
    }

    public MyBuild setName(String name) {
        this.name = name;
        return this;
    }


}
