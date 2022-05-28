package com.david.pattern.creational.factory;

/**
 * 原始未重构前的类
 *
 * @author david
 * @since 2022/5/21
 */
public class RuleConfigSource {
    //使用工厂后的
    public void load1(String ruleConfigFilePath) {
        new RuleConfigParserFactory().getParser(getFileExtension(ruleConfigFilePath)).parse("aaa");
    }

    //使用工厂前的
    public void load(String ruleConfigFilePath) {
        String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);
        IRuleConfigParser parser = null;
        if ("json".equalsIgnoreCase(ruleConfigFileExtension)) {
            parser = new JsonRuleConfigParser();
        } else if ("xml".equalsIgnoreCase(ruleConfigFileExtension)) {
            parser = new XmlRuleConfigParser();
        } else if ("yaml".equalsIgnoreCase(ruleConfigFileExtension)) {
            parser = new YamlRuleConfigParser();
        } else if ("properties".equalsIgnoreCase(ruleConfigFileExtension)) {
            parser = new PropertiesRuleConfigParser();
        } else {
            throw new RuntimeException("Rule config file format is not supported: " + ruleConfigFilePath);
        }
        String configText = "";
        parser.parse(configText);
    }

    private String getFileExtension(String filePath) {
        //...解析文件名获取扩展名，比如rule.json，返回json
        return "json";
    }

    private static class RuleConfig {
    }
}
