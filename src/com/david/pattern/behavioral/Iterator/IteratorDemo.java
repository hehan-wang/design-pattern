package com.david.pattern.behavioral.Iterator;

import java.util.ArrayList;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("xzg");
        names.add("wang");
        names.add("zheng");
        for (ArrayIterator<String> iterator = new ArrayIterator<>(names); iterator.hasNext(); iterator.next()) {
            System.out.println(iterator.currentItem());
        }
    }
}
