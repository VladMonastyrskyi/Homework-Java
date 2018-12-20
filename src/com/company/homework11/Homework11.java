package com.company.homework11;

import java.util.Arrays;
import java.util.Iterator;

public class Homework11 {

    public static void main(String[] args) {
        DefaultList<Integer> list = new DefaultList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        for (Integer i : list) {
            System.out.print(i + " ");
        }
        System.out.println();

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.println("Next: " + it.next());
            System.out.println("Before remove: " + Arrays.toString(list.toArray()));
            it.remove();
            System.out.println("After remove: " + Arrays.toString(list.toArray()));
        }
        System.out.println();

        DefaultList<Integer> list2 = new DefaultList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        for (Integer i : list2) {
            System.out.print(i + " ");
        }
        System.out.println();

        ListIterator<Integer> lIt = list2.listIterator();
        System.out.println("Next: " + lIt.next());
        System.out.println("Next: " + lIt.next());
        System.out.println("Has previous: " + lIt.hasPrevious());
        System.out.println("Previous: " + lIt.previous());
        System.out.println("Before remove: " + Arrays.toString(list2.toArray()));
        lIt.remove();
        System.out.println("After remove: " + Arrays.toString(list2.toArray()));
    }
}
