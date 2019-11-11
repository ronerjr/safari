package com.roner.safari.animal.behavior.impl;

import com.roner.safari.animal.behavior.Flyable;

public class FlyWithWings implements Flyable {

    @Override
    public String fly() {
        return "It flies with wings";
    }
}
