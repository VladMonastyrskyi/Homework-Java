package com.company.homework8;

public interface MyList<T> {
    void add(T e);

    void clear();

    boolean remove(T o);

    Object[] toArray();

    int size();

    boolean contains(T o);

    boolean containsAll(MyList<T> l);
}
