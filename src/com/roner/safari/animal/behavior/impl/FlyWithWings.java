package com.roner.safari.animal.behavior.impl;

import com.roner.safari.animal.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

  @Override
  public String fly() {
    return "It flies with wings";
  }
}
