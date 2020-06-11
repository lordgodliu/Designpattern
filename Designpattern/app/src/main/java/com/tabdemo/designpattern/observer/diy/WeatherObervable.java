package com.tabdemo.designpattern.observer.diy;

import java.util.ArrayList;

/**
 * diy观察者模式==》定义被观察者
 */
public class WeatherObervable extends WeatherOberver {

  ArrayList<WeatherOberver>  list  = new ArrayList<>();

  public void add(WeatherOberver observerListener){
        list.add(observerListener);
  }

  public void remove(WeatherOberver observerListener){
        if (list.contains(observerListener)){
            list.remove(observerListener);
        }
  }

    @Override
    public void typhoon() {
        for (WeatherOberver observerListener: list){
            observerListener.typhoon();
        }
    }

    @Override
    public void sun() {
        for (WeatherOberver observerListener : list){
            observerListener.sun();
        }
    }

    @Override
    public void rain() {
        for (WeatherOberver observerListener : list){
            observerListener.rain();
        }
    }
}
