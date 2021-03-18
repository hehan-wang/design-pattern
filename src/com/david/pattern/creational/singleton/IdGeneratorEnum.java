package com.david.pattern.creational.singleton;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 枚举
 * 使用java特性保持单例
 */
public enum IdGeneratorEnum {
    INSTANCE;
    private AtomicLong id = new AtomicLong(0);

    public long getId() {
        return id.incrementAndGet();
    }
}
