package com.company.homework11;

import java.util.Iterator;

interface ListIterator<T> extends Iterator<T> {
    boolean hasPrevious();

    T previous();

    void set(T e);

    void remove();
}