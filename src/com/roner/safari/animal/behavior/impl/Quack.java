package com.roner.safari.animal.behavior.impl;

import com.roner.safari.animal.behavior.QuackBehavior;

public class Quack implements QuackBehavior {

  @Override
  public String quack() {
    return "It quacks";
  }
}
