package com.roner.safari.supply.area;

import com.roner.safari.supply.supplier.Observer;

public interface Subject {
  boolean registerObserver(Observer observer);

  boolean removeObserver(Observer observer);

  void notifyObservers();
}
