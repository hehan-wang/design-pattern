package com.david.pattern.behavioral.command;

public class CommandDemo {
    public static void main(String[] args) {
        GameApplication application = new GameApplication();
        new Thread(() -> {
            while (true) {
                try {
                    application.request(new Request(Event.ARCHIVE));
                    Thread.sleep(400L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        application.mainloop();

    }
}
