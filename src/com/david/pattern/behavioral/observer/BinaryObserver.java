package com.david.pattern.behavioral.observer;

public class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject) {//向被观察者注册自己
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
    }
}
