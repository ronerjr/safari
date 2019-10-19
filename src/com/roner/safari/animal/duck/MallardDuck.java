package com.roner.safari.animal.duck;

import com.roner.safari.animal.behavior.impl.FlyWithWings;
import com.roner.safari.animal.behavior.impl.Quack;
import com.roner.safari.animal.behavior.impl.Swim;

public class MallardDuck extends Duck {
  public MallardDuck() {
    this.flyBehavior = new FlyWithWings();
    this.quackBehavior = new Quack();
    this.swimBehavior = new Swim();
  }
}
