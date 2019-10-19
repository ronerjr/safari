package com.roner.safari.supply.supplier;

public interface Observer {
  void update(double foodAmount, boolean cleaningStatus, int amount);
}

