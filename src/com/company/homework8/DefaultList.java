package com.company.homework8;

import java.util.Arrays;

public class DefaultList<T> implements MyList<T> {

    private static final Object[] EMPTY_ARRAY = {};

    private Object[] array;
    private int size;

    DefaultList() {
        array = EMPTY_ARRAY;
    }

    @Override
    public void add(T e) {
        array = Arrays.copyOf(array, ++size);
        array[size - 1] = e;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
    }

    @Override
    public boolean remove(T o) {
        if (indexOf(o) != -1) {
            int moveStep = size - indexOf(o) - 1;
            if (moveStep > 0) {
                System.arraycopy(array, indexOf(o) + 1, array, indexOf(o), moveStep);
            }
            array[--size] = null;
            return true;
        }
        return false;
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(array, size);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(T o) {
        return indexOf(o) >= 0;
    }

    @Override
    @SuppressWarnings("unchecked")
    public boolean containsAll(MyList<T> l) {
        if (l.size() != 0) {
            Object[] objs = l.toArray();
            for (int i = 0; i < l.size(); i++) {
                if (!contains((T) objs[i])) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private int indexOf(T o) {
        for (int i = 0; i < size; i++)
            if (o.equals(array[i]))
                return i;
        return -1;
    }
}
