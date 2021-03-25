package com.david.pattern.behavioral.command;

public class ArchiveCommand implements Command {
    @Override
    public void execute() {
        System.out.println("ArchiveCommand...");
    }
}
