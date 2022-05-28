package com.david.pattern.creational.factory;

public class FactoryDemo {
    public static void main(String[] args) {
        new RuleConfigParserFactory().getParser("json").parse("aaa");
        new RuleConfigParserFactory().getParser("xml").parse("aaa");
    }
}
