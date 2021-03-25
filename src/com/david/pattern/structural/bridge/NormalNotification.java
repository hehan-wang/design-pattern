package com.david.pattern.structural.bridge;

public class NormalNotification extends Notification {
    public NormalNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String message) {
        System.out.println("NormalNotification...");
        msgSender.send(message);
    }
}
