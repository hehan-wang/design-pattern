package com.david.pattern.behavioral.observer;

/**
 * 观察者
 */
public abstract class Observer {
    protected Subject subject;//关联被观察者

    public abstract void update();
}
