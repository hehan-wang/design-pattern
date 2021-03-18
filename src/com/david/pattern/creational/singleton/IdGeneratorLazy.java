package com.david.pattern.creational.singleton;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 懒汉式
 * 优点：延迟加载 第一次调用getInstance才加载
 * 缺点：synchronized 效率低 并发度为1
 */
public class IdGeneratorLazy {
    private AtomicLong id = new AtomicLong(0);
    private static IdGeneratorLazy instance;

    private IdGeneratorLazy() {
    }

    public static synchronized IdGeneratorLazy getInstance() {
        if (instance == null) {
            instance = new IdGeneratorLazy();
        }
        return instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
