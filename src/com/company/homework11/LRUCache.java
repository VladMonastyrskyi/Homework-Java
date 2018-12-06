package com.company.homework11;

import java.util.concurrent.LinkedBlockingDeque;

public class LRUCache<T> {

    private LinkedBlockingDeque<T> cache;
    private int capacity;

    public LRUCache(int capacity) {
        if (capacity <= 0) throw new IllegalArgumentException();

        this.capacity = capacity;
        this.cache = new LinkedBlockingDeque<>(capacity);
    }

    public T get(T element) {
        if (cache.contains(element)) {
            cache.remove(element);
            cache.addLast(element);
            return cache.getLast();
        }
        return null;
    }

    public void put(T element) {
        if (element != null) {
            if (cache.size() < capacity) {
                if (!cache.contains(element)) {
                    cache.addLast(element);
                }
            } else {
                cache.removeFirst();
                cache.addLast(element);
            }
        }
    }

    @Override
    public String toString() {
        return String.valueOf(cache);
    }
}
