package com.roner.safari.animal.duck;

import com.roner.safari.animal.behavior.Flyable;
import com.roner.safari.animal.behavior.Quackable;
import com.roner.safari.animal.behavior.Swimmable;

public class Duck {
    private final Flyable flyable;
    private final Quackable quackable;
    private final Swimmable swimmable;

    public Duck(Flyable flyable, Quackable quackable, Swimmable swimmable) {
        this.flyable = flyable;
        this.quackable = quackable;
        this.swimmable = swimmable;
    }

    public void performFly() {
        System.out.println(flyable.fly());
    }

    public void performQuack() {
        System.out.println(quackable.quack());
    }

    public void performSwim() {
        System.out.println(swimmable.swin());
    }
}
