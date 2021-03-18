package com.david.pattern.creational.factory;

public class JsonRuleConfigParser implements IRuleConfigParser {
    @Override
    public void parse(String text) {
        System.out.println("json:" + text);
    }
}
