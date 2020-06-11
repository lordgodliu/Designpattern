package com.tabdemo.designpattern.observer.diy;

/**
 * diy观察者模式==》定义观察者
 */
public abstract class WeatherOberver {

    public void typhoon(){}

    public abstract void sun();
    public abstract void rain();
}
