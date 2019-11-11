package com.roner.safari.commons;

public interface Subject {
    boolean registerObserver(Observer observer);

    boolean removeObserver(Observer observer);

    void notifyObservers();
}
