package com.david.pattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者
 */
public class Subject {
    private int state;//被观察者的状态
    private List<Observer> observers = new ArrayList<>();//注册的观察者

    public int getState() {
        return state;
    }

    //被观察者状态变更通知所有观察者
    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        observers.forEach(Observer::update);
    }

}
