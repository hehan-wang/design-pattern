package com.david.pattern.creational.singleton;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 双重校验法
 * 优点：延迟加载 并发度高
 * 缺点：实现复杂  在低版本jdk由于指令重排序 高并发情况下会导致没初始化被其他线程拿走 。新版本jdk内部解决(new 和初始化为原子操作)
 */
public class IdGeneratorEagerDoubleCheck {
    private AtomicLong id = new AtomicLong(0);

    private static IdGeneratorEagerDoubleCheck instance;

    private IdGeneratorEagerDoubleCheck() {
    }

    /**
     * 第一层判断 多线程调用的时候 实例为null的线程去争抢锁去创建实例(可能有多个线程)
     * 第二层判断 第一个进来的线程 实例为null创建实例 后面进来的Instance!=null 直接返回
     */
    public static IdGeneratorEagerDoubleCheck getInstance() {
        if (instance == null) {
            synchronized (IdGeneratorEagerDoubleCheck.class) {
                if (instance == null) {
                    instance = new IdGeneratorEagerDoubleCheck();
                }
            }
        }
        return instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
