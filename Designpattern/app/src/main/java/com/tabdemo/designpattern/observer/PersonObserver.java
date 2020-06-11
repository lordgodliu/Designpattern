package com.tabdemo.designpattern.observer;

import android.util.Log;

import java.util.Observable;
import java.util.Observer;

/**
 * Android系统 实现观察者模式==》观察者
 */
public class PersonObserver implements Observer {
    static final String TAG = PersonObserver.class.getSimpleName();
   String name;

    public PersonObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        Log.d(TAG, name + " 接收到通知啦 " + o);
    }
}
