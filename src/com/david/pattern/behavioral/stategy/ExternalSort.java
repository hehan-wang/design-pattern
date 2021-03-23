package com.david.pattern.behavioral.stategy;

public class ExternalSort implements ISortAlg {
    @Override
    public void sort(String path) {
        System.out.println("ExternalSort:" + path);
    }
}
