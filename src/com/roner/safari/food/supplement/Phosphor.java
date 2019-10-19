package com.roner.safari.food.supplement;

import com.roner.safari.food.Food;

public class Phosphor extends SupplementDecorator {
  Food food;
  double quantity;

  public Phosphor(Food food, double quantity) {
    if (quantity < 0) {
      throw new IllegalArgumentException("Quantity must be a positive number");
    }
    this.food = food;
    this.quantity = quantity;
    this.food.setPhosphor(this.food.getPhosphor() + quantity);
  }

  @Override
  public String getDescription() {
    return food.getDescription() + " +Calcium";
  }

  @Override
  public double getCost() {
    return food.getCost() + (quantity * 1.23);
  }
}
