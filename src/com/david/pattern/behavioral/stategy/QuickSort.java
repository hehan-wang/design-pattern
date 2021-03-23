package com.david.pattern.behavioral.stategy;

public class QuickSort implements ISortAlg {
    @Override
    public void sort(String path) {
        System.out.println("QuickSort:" + path);
    }
}
