package Observers;

import Eggs.Egg;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Egg> eggs;
    private List<Observer> observers;

    public Basket() {
        eggs = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public void addEgg(Egg egg) {
        eggs.add(egg);
        if (eggs.size() >= 5) {
            notifyObservers();
        }
    }

    public void removeEgg(Egg egg) {
        eggs.remove(egg);
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
