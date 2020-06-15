package com.tabdemo.designpattern.command;

import androidx.annotation.NonNull;

public  class BakeMuttonCommand extends Command {


    public BakeMuttonCommand(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    public void excuteCommand() {
        barbecuer.bakeMutton();
    }

    @NonNull
    @Override
    public String toString() {
        return "11111111111111111111111111";
    }
}
