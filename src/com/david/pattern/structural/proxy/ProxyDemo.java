package com.david.pattern.structural.proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        MetricDynamicProxy<UserService> proxy = new MetricDynamicProxy<>();
        UserService service = proxy.createProxy(new UserServiceImpl());
        service.register("david_wang");
        service.register("david_wang1");
    }
}
