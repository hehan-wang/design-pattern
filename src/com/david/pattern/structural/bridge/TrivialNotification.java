package com.david.pattern.structural.bridge;

public class TrivialNotification extends Notification {
    public TrivialNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String message) {
        System.out.println("TrivialNotification...");
        msgSender.send(message);
    }
}
