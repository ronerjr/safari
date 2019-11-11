package com.roner.safari.animal.behavior.impl;

import com.roner.safari.animal.behavior.Quackable;

public class Quack implements Quackable {

    @Override
    public String quack() {
        return "It quacks";
    }
}
