package com.david.pattern.behavioral.command;

public class GotStartCommand implements Command {
    @Override
    public void execute() {
        System.out.println("GotStartCommand...");
    }
}
