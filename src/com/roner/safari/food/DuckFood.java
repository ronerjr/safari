package com.roner.safari.food;

public class DuckFood extends Food {
    public DuckFood() {
        this.setVitamin_a(10)
                .setVitamin_d(5)
                .setVitamin_e(2)
                .setVitamin_k(12)
                .setCalcium(20)
                .setDescription("Its a duck food");
    }

    @Override
    public double getCost() {
        return 50;
    }
}
