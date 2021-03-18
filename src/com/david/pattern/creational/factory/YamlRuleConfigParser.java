package com.david.pattern.creational.factory;

public class YamlRuleConfigParser implements IRuleConfigParser {
    @Override
    public void parse(String text) {
        System.out.println("yaml:" + text);
    }
}
