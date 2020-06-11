package com.tabdemo.designpattern.single;

/**
 * 单线程
 */
public class Single1 {

    private static Single1 intance;
    private Single1(){}
    public static Single1 getIntance(){
        if (intance==null){
            intance = new Single1();
        }
        return intance;
    }
}
