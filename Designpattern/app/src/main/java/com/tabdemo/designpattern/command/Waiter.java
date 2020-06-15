package com.tabdemo.designpattern.command;

import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Waiter {

    private static final String TAG = "Waiter";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private List<Command> orders = new ArrayList<Command>();

    public void setOrders(Command command) {
        orders.add(command);
        Log.d(TAG, "setOrders: 11111111111111111");
    }

    public void cancelOrder(Command command){
        orders.remove(command);
        Log.d(TAG, "cancelOrder: 222222222222222");
    }

    public void notifyA(){
        for (Command command : orders){
            command.excuteCommand();
        }
    }
}
