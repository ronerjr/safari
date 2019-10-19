package com.roner.safari.food;

public abstract class Food {
  private double vitamin_a;
  private double vitamin_d;
  private double vitamin_e;
  private double vitamin_k;
  private double calcium;
  private double phosphor;
  private double potassium;
  private String description;

  public abstract double getCost();

  public double getVitamin_a() {
    return vitamin_a;
  }

  public void setVitamin_a(double vitamin_a) {
    this.vitamin_a = vitamin_a;
  }

  public double getVitamin_d() {
    return vitamin_d;
  }

  public void setVitamin_d(double vitamin_d) {
    this.vitamin_d = vitamin_d;
  }

  public double getVitamin_e() {
    return vitamin_e;
  }

  public void setVitamin_e(double vitamin_e) {
    this.vitamin_e = vitamin_e;
  }

  public double getVitamin_k() {
    return vitamin_k;
  }

  public void setVitamin_k(double vitamin_k) {
    this.vitamin_k = vitamin_k;
  }

  public double getCalcium() {
    return calcium;
  }

  public void setCalcium(double calcium) {
    this.calcium = calcium;
  }

  public double getPhosphor() {
    return phosphor;
  }

  public void setPhosphor(double phosphor) {
    this.phosphor = phosphor;
  }

  public double getPotassium() {
    return potassium;
  }

  public void setPotassium(double potassium) {
    this.potassium = potassium;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public String toString() {
    return "Food{" +
        "vitamin_a=" + vitamin_a +
        ", vitamin_d=" + vitamin_d +
        ", vitamin_e=" + vitamin_e +
        ", vitamin_k=" + vitamin_k +
        ", calcium=" + calcium +
        ", phosphor=" + phosphor +
        ", potassium=" + potassium +
        '}';
  }
}
