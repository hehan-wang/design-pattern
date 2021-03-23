package com.david.pattern.behavioral.stategy;

public class ConcurrentExternalSort implements ISortAlg {
    @Override
    public void sort(String path) {
        System.out.println("ConcurrentExternalSort:" + path);
    }
}
