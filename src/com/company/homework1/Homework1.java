package com.company.homework1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Homework1 {

    static class Part2 {
        void getSum(int a, int b) {
            System.out.println("Аргументы ком. строки: " + a + " " + b);
            System.out.println("Сумма: " + (a + b));
        }
    }

    static class Part3 {
        void gcd(int a, int b) {
            while (b != 0) {
                int temp = a % b;
                a = b;
                b = temp;
            }
            System.out.println("НОД: " + a);
        }
    }

    static class Part4 {
        void totalNumberSum(String number) {
            int result = 0;
            for (int i = 0; i < number.length(); i++) {
                result += Character.getNumericValue(number.charAt(i));
            }
            System.out.println("Сумма цифр числа " + number + ": " + result);
        }
    }

    static class Part5 {
        private Map<String, Integer> table;

        Part5() {
            table = new HashMap<>();
            for (int i = 0; i < 26; i++) {
                table.put(String.valueOf((char) (65 + i)), i + 1);
            }
        }

        void getNumberByLetter(String letter) {
            table.entrySet().stream().filter(x -> x.getKey().equals(letter)).map(Map.Entry::getValue).forEach(System.out::println);
        }

        void getLetterByNumber(int number) {
            table.entrySet().stream().filter(x -> x.getValue().equals(number)).map(Map.Entry::getKey).forEach(System.out::println);
        }

        void getRightColumn(String letter) {
            Iterator<Map.Entry<String, Integer>> it = table.entrySet().iterator();
            for (; it.hasNext(); ) {
                Map.Entry<String, Integer> entry = it.next();
                if (entry.getKey().equals(letter) && it.hasNext()) {
                    System.out.println(it.next().getKey());
                    break;
                } else if (entry.getKey().equals(letter) && !it.hasNext()) {
                    System.out.println("Empty");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
//        1
        System.out.println("Hello World");

//        2
        Part2 part2 = new Part2();
        if (args.length == 2)
            part2.getSum(Integer.valueOf(args[0]), Integer.valueOf(args[1]));

//        3
        Part3 part3 = new Part3();
        part3.gcd(55, 15);

//        4
        Part4 part4 = new Part4();
        if (args.length == 1)
            part4.totalNumberSum(args[0]);

//        5
        Part5 part5 = new Part5();
        part5.getNumberByLetter("L");
        part5.getLetterByNumber(11);
        part5.getRightColumn("B");
    }
}
