package com.roner.safari.food.supplement;

import com.roner.safari.food.Food;

public class Potassium extends SupplementDecorator {
  Food food;
  double quantity;

  public Potassium(Food food, double quantity) {
    if (quantity < 0) {
      throw new IllegalArgumentException("Quantity must be a positive number");
    }
    this.food = food;
    this.quantity = quantity;
    this.food.setPotassium(this.food.getPotassium() + quantity);
  }

  @Override
  public String getDescription() {
    return food.getDescription() + " +Potassium";
  }

  @Override
  public double getCost() {
    return food.getCost() + (quantity * 0.79);
  }
}
