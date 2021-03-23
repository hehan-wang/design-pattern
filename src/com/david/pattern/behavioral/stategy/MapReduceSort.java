package com.david.pattern.behavioral.stategy;

public class MapReduceSort implements ISortAlg {
    @Override
    public void sort(String path) {
        System.out.println("MapReduceSort:" + path);
    }
}
