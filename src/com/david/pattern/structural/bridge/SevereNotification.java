package com.david.pattern.structural.bridge;

public class SevereNotification extends Notification {
    public SevereNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String message) {
        System.out.println("SevereNotification...");
        msgSender.send(message);
    }
}
