package com.david.pattern.behavioral.Iterator;

import java.util.List;
import java.util.NoSuchElementException;

public class ArrayIterator<E> implements Iterator<E> {
    private int cursor = 0;
    private List<E> list;

    public ArrayIterator(List<E> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return cursor < list.size();
    }

    @Override
    public void next() {
        cursor++;
    }

    @Override
    public E currentItem() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return list.get(cursor);
    }
}
