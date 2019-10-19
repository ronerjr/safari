package com.roner.safari.animal.duck;

import com.roner.safari.animal.behavior.FlyBehavior;
import com.roner.safari.animal.behavior.QuackBehavior;
import com.roner.safari.animal.behavior.SwimBehavior;

public class Duck {
  FlyBehavior flyBehavior;
  QuackBehavior quackBehavior;
  SwimBehavior swimBehavior;

  public void performFly() {
    System.out.println(flyBehavior.fly());
  }

  public void performQuack() {
    System.out.println(quackBehavior.quack());
  }

  public void performSwim() {
    System.out.println(swimBehavior.swin());
  }
}
