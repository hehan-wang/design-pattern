package com.david.pattern.behavioral.command;

public class Request {
    private Event event;

    public Request(Event event) {
        this.event = event;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
}
