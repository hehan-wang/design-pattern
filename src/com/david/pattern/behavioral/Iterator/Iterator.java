package com.david.pattern.behavioral.Iterator;

public interface Iterator<E> {
    boolean hasNext();

    void next();

    E currentItem();
}
