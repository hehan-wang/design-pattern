package com.david.pattern.behavioral.chain;

public class ChainDemo {
    public static void main(String[] args) {
        SensitiveWordFilterChain chain = new SensitiveWordFilterChain();
        chain.addFilterChain(new SexyWordFilter());
        chain.addFilterChain(new PoliticalWordFilter());
        chain.addFilterChain(new AdsWordFilter());
        Context context = new Context();
        context.setWord("demo message");
        boolean pass = chain.doFilter(context);
        System.out.println("pass:" + pass);
    }
}
