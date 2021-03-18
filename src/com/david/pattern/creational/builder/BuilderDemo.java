package com.david.pattern.creational.builder;

public class BuilderDemo {
    public static void main(String[] args) {
        //在build阶段会报错
        ResourcePoolConfig config = new ResourcePoolConfig.Builder().setName("dbconnectionpool").setMaxTotal(16).setMaxIdle(10).setMinIdle(12).build();
    }
}
