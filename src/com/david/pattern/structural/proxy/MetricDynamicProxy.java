package com.david.pattern.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MetricDynamicProxy<T> {
    private T t;

    public T createProxy(T t) {
        Class<?>[] interfaces = t.getClass().getInterfaces();
        return (T) Proxy.newProxyInstance(getClass().getClassLoader(), interfaces, new LogDynamicProxyHandler<>(t));
    }

    public static class LogDynamicProxyHandler<T> implements InvocationHandler {
        private T t;

        public LogDynamicProxyHandler(T t) {
            this.t = t;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            long startTimestamp = System.currentTimeMillis();
            Object result = method.invoke(t, args);//原始方法调用
            long endTimeStamp = System.currentTimeMillis();
            long responseTime = endTimeStamp - startTimestamp;
            String apiName = t.getClass().getName() + ":" + method.getName();
            System.out.println(apiName + " cost:" + responseTime);
            return result;
        }
    }

}
