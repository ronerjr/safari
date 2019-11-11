package com.roner.safari.supply.supplier;

import com.roner.safari.commons.Observer;

public class DuckSupplier implements Observer {
    @Override
    public void update(double foodAmount, boolean cleaningStatus, int amount) {
        System.out.println("There are " + foodAmount + "pounds of food");
        System.out.println("Is it cleaned: " + cleaningStatus);
        System.out.println("There are " + amount + " ducks in the area");
        System.out.println("=== starting validations ===");
        validations(foodAmount, cleaningStatus, amount);
        System.out.println("=== finishing validations ===\n");
    }

    private void validations(double foodAmount, boolean cleaningStatus, int amount) {
        if (foodAmount / amount < 5) {
            System.out.println("Duck area needs more food");
        }
        if (!cleaningStatus) {
            System.out.println("It must be cleaned soon");
        }
        if (amount > 200) {
            System.out.println("The area is over populated");
        }
    }

}