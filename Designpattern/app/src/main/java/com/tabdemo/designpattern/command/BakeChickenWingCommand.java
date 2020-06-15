package com.tabdemo.designpattern.command;

import androidx.annotation.NonNull;

public class BakeChickenWingCommand extends Command {
    public BakeChickenWingCommand(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    public void excuteCommand() {
        barbecuer.bakeChickenWing();
    }

    @NonNull
    @Override
    public String toString() {
        return "2222222222222222222222";
    }
}
