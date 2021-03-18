package com.david.pattern.creational.singleton;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 饿汉式
 * 在类加载的时候初始化对象
 * 优点：fail-fast能更快暴露问题
 * 缺点：可能占用过多资源 启动慢
 */

public class IdGeneratorEager {
    // AtomicLong是一个Java并发库中提供的一个原子变量类型,
    // 它将一些线程不安全需要加锁的复合操作封装为了线程安全的原子操作，
    // 比如下面会用到的incrementAndGet().
    private AtomicLong id = new AtomicLong(0);
    private static final IdGeneratorEager instance = new IdGeneratorEager();

    private IdGeneratorEager() {
    }

    public static IdGeneratorEager getInstance() {
        return instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }

//    public static void main(String[] args) {
//        long id = IdGenerator.getInstance().getId();
//        System.out.println(id);
//        System.out.println(IdGenerator.getInstance() == IdGenerator.getInstance());
//    }
}
