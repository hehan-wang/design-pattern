package com.david.pattern.structural.bridge;

import java.util.List;

public class EmailMsgSender implements MsgSender {
    private List<String> emails;

    public EmailMsgSender(List<String> emails) {
        this.emails = emails;
    }

    @Override
    public void send(String message) {
        System.out.println("send email:" + emails + " " + message);
    }
}
