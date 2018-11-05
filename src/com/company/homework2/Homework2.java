package com.company.homework2;

import java.util.Scanner;

public class Homework2 {

    static class Triangle {
        private double a, h, S;

        void setA(double a) {
            this.a = a;
        }

        void setH(double h) {
            this.h = h;
        }

        void getS() {
            System.out.println(S = ((a * h) / 2.0));
        }
    }

    static class Circle {
        private double r, length;

        void setRadius(double r) {
            this.r = r;
        }

        void getCircleLength() {
            System.out.println(length = 2 * Math.PI * r);
        }
    }

    public static void main(String[] args) {
        // 1
        System.out.print("Введите число: ");
        Scanner in = new Scanner(System.in);
        String number;
        for (; true; ) {
            number = in.next();
            if (number.length() == 6) {
                System.out.println("\nРезультат:");
                for (int i = 0; i < number.length(); i++) {
                    System.out.println(number.charAt(i));
                }
                break;
            }
        }

        // 2
        Scanner in1 = new Scanner(System.in);
        Triangle triangle = new Triangle();
        System.out.print("Введите длину основания треугольника: ");
        triangle.setA(in1.nextDouble());
        System.out.print("Введите высоту треугольника: ");
        triangle.setH(in1.nextDouble());
        System.out.print("Площадь треугольника: ");
        triangle.getS();

        // 3
        Scanner in2 = new Scanner(System.in);
        Circle circle = new Circle();
        System.out.print("Введите радиус круга: ");
        circle.setRadius(in2.nextDouble());
        circle.getCircleLength();
    }
}
