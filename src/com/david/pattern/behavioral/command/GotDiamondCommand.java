package com.david.pattern.behavioral.command;

public class GotDiamondCommand implements Command {
    @Override
    public void execute() {
        System.out.println("GotDiamondCommand...");
    }
}
