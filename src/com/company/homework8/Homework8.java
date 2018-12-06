package com.company.homework8;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework8 {

    public static void main(String[] args) {
        DefaultList<Integer> list = new DefaultList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(Arrays.toString(list.toArray()));

        System.out.println(list.contains(2));
        System.out.println(list.contains(5));

        System.out.println(list.remove(4));
        System.out.println(Arrays.toString(list.toArray()));

        DefaultList<Integer> list2 = new DefaultList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(3);
        list2.add(5);
        System.out.println(list.containsAll(list2));

        list.clear();
        System.out.println(Arrays.toString(list.toArray()));
    }
}
