package com.company.homework11;

public class Homework11 {

    public static void main(String[] args) {
        LRUCache<Integer> cache = new LRUCache<>(4);
        cache.put(1);
        cache.put(2);
        cache.put(3);
        cache.put(4);
        System.out.println(cache);
        cache.get(1);
        System.out.println(cache);
        cache.put(5);
        System.out.println(cache);
    }
}
