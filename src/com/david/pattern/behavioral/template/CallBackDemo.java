package com.david.pattern.behavioral.template;

public class CallBackDemo {
    public static void main(String[] args) {
        new Processer().process(data -> System.out.println("handle data:" + data), "aaa");
    }

    public static interface Handler {
        void handle(String data);
    }

    public static class Processer {
        public void process(Handler handler, String data) {
            System.out.println("pre...");
            handler.handle(data);
            System.out.println("post...");
        }
    }
}
