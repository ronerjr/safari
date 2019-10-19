package com.roner.safari.supply.area;

public class AnimalArea {
  private double foodAmount;
  private boolean cleaningStatus;
  private int amount;

  public double getFoodAmount() {
    return foodAmount;
  }

  public void setFoodAmount(double foodAmount) {
    this.foodAmount = foodAmount;
  }

  public boolean isCleaningStatus() {
    return cleaningStatus;
  }

  public void setCleaningStatus(boolean cleaningStatus) {
    this.cleaningStatus = cleaningStatus;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }
}
