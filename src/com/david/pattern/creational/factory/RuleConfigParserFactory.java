package com.david.pattern.creational.factory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

//工厂类 也可以通过非静态 实例化的方式创建
public class RuleConfigParserFactory {
    private final Map<String, IRuleConfigParser> FACTORY = new ConcurrentHashMap<>();

    public RuleConfigParserFactory() {
        FACTORY.put("json", new JsonRuleConfigParser());
        FACTORY.put("xml", new XmlRuleConfigParser());
        FACTORY.put("yaml", new YamlRuleConfigParser());
        FACTORY.put("properties", new PropertiesRuleConfigParser());
    }


    public IRuleConfigParser getParser(String type) {
        if (type == null || type.isEmpty()) {
            return null;
        }
        return FACTORY.get(type);
    }
}
