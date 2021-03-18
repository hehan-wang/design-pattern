package com.david.pattern.creational.factory;

public class XmlRuleConfigParser implements IRuleConfigParser {
    @Override
    public void parse(String text) {
        System.out.println("xml:" + text);
    }
}
