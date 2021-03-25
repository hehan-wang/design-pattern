package com.david.pattern.behavioral.command;

public class HitObstacleCommand implements Command {
    @Override
    public void execute() {
        System.out.println("HitObstacleCommand...");
    }
}
