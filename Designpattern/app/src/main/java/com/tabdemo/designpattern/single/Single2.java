package com.tabdemo.designpattern.single;

/**
 * 多线程优化
 */
public class Single2 {

    private volatile static Single2 intance;
    private Single2(){}
    public static Single2 getIntance(){
        if (intance==null){
            synchronized (Single2.class){
                if (intance==null){
                    intance = new Single2();
                }
            }
        }
        return intance;
    }
}
