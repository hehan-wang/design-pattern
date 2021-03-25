package com.david.pattern.structural.bridge;

public class UrgencyNotification extends Notification {
    public UrgencyNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String message) {
        System.out.println("UrgencyNotification...");
        msgSender.send(message);
    }
}
