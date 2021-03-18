package com.david.pattern.creational.factory;

public class PropertiesRuleConfigParser implements IRuleConfigParser {
    @Override
    public void parse(String text) {
        System.out.println("properties:" + text);
    }
}
