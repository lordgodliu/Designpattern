package com.tabdemo.designpattern.observer;

import java.util.Observable;

/**
 * Android系统 实现观察者模式==》被观察者
 */
public class AndroidObervable extends Observable {
    static final String TAG = AndroidObervable.class.getSimpleName();
    public void postNewVersion(String version){
        setChanged(); // 标示内容发生改变
        notifyObservers(version);// 通知所有观察者
    }


}
