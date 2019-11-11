package com.roner.safari.supply.area;

import com.roner.safari.commons.Observer;
import com.roner.safari.commons.Subject;

import java.util.ArrayList;
import java.util.List;

public class DuckArea extends AnimalArea implements Subject {
    private static DuckArea instance;
    private List<Observer> observers;

    private DuckArea() {
        observers = new ArrayList();
    }

    public static synchronized DuckArea getInstance() {
        if(instance == null) {
            instance = new DuckArea();
        }
        return instance;
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
