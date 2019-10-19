package com.roner.safari.supply.area;

import com.roner.safari.supply.supplier.Observer;

import java.util.ArrayList;
import java.util.List;

public class DuckArea extends AnimalArea implements Subject {
  private List<Observer> observers;

  public DuckArea() {
    observers = new ArrayList();
  }

  @Override
  public boolean registerObserver(Observer observer) {
    return observers.add(observer);
  }

  @Override
  public boolean removeObserver(Observer observer) {
    return observers.remove(observer);
  }

  @Override
  public void notifyObservers() {
    for (Observer observer : observers) {
      observer.update(getFoodAmount(), isCleaningStatus(), getAmount());
    }
  }

  public void updateStatusArea(double foodAmount, boolean cleaningStatus, int amount) {
    this.setFoodAmount(foodAmount);
    this.setCleaningStatus(cleaningStatus);
    this.setAmount(amount);
    notifyObservers();
  }
}
