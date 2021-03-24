package com.david.pattern.structural.proxy;

public class UserServiceImpl implements UserService {
    @Override
    public void register(String username) {
        System.out.println("UserServiceImpl register:" + username);
    }
}
