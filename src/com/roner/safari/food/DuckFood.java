package com.roner.safari.food;

public class DuckFood extends Food {
  public DuckFood() {
    this.setVitamin_a(10);
    this.setVitamin_d(5);
    this.setVitamin_e(2);
    this.setVitamin_k(12);
    this.setCalcium(20);
    this.setPhosphor(0);
    this.setPotassium(0);
    this.setDescription("Its a duck food");
  }

  @Override
  public double getCost() {
    return 50;
  }
}
