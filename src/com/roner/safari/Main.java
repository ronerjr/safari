package com.roner.safari;

import com.roner.safari.animal.duck.Duck;
import com.roner.safari.animal.duck.MallardDuck;
import com.roner.safari.food.DuckFood;
import com.roner.safari.food.Food;
import com.roner.safari.food.supplement.Phosphor;
import com.roner.safari.food.supplement.Potassium;
import com.roner.safari.supply.area.DuckArea;
import com.roner.safari.supply.supplier.DuckSupplier;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

  public static void main(String[] args) {
    System.out.println("Safari is running");
    Duck duck = new MallardDuck();
    duck.performFly();
    duck.performQuack();
    duck.performSwim();

    Food food = new DuckFood();
    food = new Phosphor(food, 10);
    food = new Potassium(food, 7);
    System.out.println(food.getDescription());
    System.out.println(food.getCost());

    DuckArea duckArea = new DuckArea();
    DuckSupplier duckSupplier = new DuckSupplier();
    Timer t = new Timer();
    TimerTask task = new TimerTask() {
      int counter;

      @Override
      public void run() {
        System.out.println(counter);
        if (counter == 5) {
          this.cancel();
        }
        if (counter % 2 != 0) {
          System.out.println("Registering a supplier on duckArea\n");
          duckArea.registerObserver(duckSupplier);
        }
        if (counter % 2 == 0) {
          System.out.println("Removing a supplier from duckArea\n");
          duckArea.removeObserver(duckSupplier);
        }
        System.out.println("Updating status area\n");
        duckArea.updateStatusArea(Math.ceil(Math.random() * 1000), new Random().nextBoolean(),
            (int) (Math.random() * 100));
        counter++;
      }
    };
    t.scheduleAtFixedRate(task, 0, 10000);
  }
}
