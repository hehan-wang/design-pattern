package com.david.pattern.creational.singleton;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 静态内部类法 推荐
 * 优点：实现简单 线程安全 延迟加载(调用getInstance方法的时候才加载内部类)
 */
public class IdGeneratorInnerClass {
    public static class IdGeneratorInnerClassHolder {
        private static final IdGeneratorInnerClass INSTANCE = new IdGeneratorInnerClass();
    }

    private AtomicLong id = new AtomicLong(0);

    private IdGeneratorInnerClass() {
    }


    public static IdGeneratorInnerClass getInstance() {
        return IdGeneratorInnerClassHolder.INSTANCE;
    }

    public long getId() {
        return id.incrementAndGet();
    }

}
