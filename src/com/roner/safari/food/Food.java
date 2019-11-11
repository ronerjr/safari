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

    public Food setVitamin_a(double vitamin_a) {
        this.vitamin_a = vitamin_a;
        return this;
    }

    public double getVitamin_d() {
        return vitamin_d;
    }

    public Food setVitamin_d(double vitamin_d) {
        this.vitamin_d = vitamin_d;
        return this;
    }

    public double getVitamin_e() {
        return vitamin_e;
    }

    public Food setVitamin_e(double vitamin_e) {
        this.vitamin_e = vitamin_e;
        return this;
    }

    public double getVitamin_k() {
        return vitamin_k;
    }

    public Food setVitamin_k(double vitamin_k) {
        this.vitamin_k = vitamin_k;
        return this;
    }

    public double getCalcium() {
        return calcium;
    }

    public Food setCalcium(double calcium) {
        this.calcium = calcium;
        return this;
    }

    public double getPhosphor() {
        return phosphor;
    }

    public Food setPhosphor(double phosphor) {
        this.phosphor = phosphor;
        return this;
    }

    public double getPotassium() {
        return potassium;
    }

    public Food setPotassium(double potassium) {
        this.potassium = potassium;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Food setDescription(String description) {
        this.description = description;
        return this;
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
