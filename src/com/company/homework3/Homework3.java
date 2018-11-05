package com.company.homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework3 {

    public static void main(String[] args) {
        // 1
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину фигуры: ");
        int height = in.nextInt();
        for (int i = 1; i < (height * 2) + 1; i++) {
            if (i <= height) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 0; j < height - (i - height); j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        // 2
        for (int i = 2; i <= 100; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(i);
            }
        }

        // 3
        Scanner in1 = new Scanner(System.in);
        System.out.print("Введите высоту: ");
        int height1 = in1.nextInt();
        System.out.print("Введите количество линий: ");
        int lines = in1.nextInt();
        System.out.print("Введите ширину: ");
        int width = in1.nextInt();
        for (int i = 0; i < height1; i++) {
            for (int j = 0; j < lines; j++) {
                for(int k = 0; k < width; k++) {
                    if (j % 2 == 0) {
                        System.out.print("+");
                    } else {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }


        // 4
        Random r = new Random();
        Scanner in2 = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int length = in2.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(9) + 1;
        }
        int[] arr2 = Arrays.copyOf(arr, arr.length * 2);
        for (int i = arr.length; i < arr2.length; i++) {
            arr2[i] = arr[i - arr.length] * 2;
        }
        System.out.println(Arrays.toString(arr2));

        // 5
        Scanner in3 = new Scanner(System.in);
        System.out.print("Введите размер матрицы: ");
        int n = in3.nextInt();
        int[][] matr = new int[n][n];
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr.length; j++) {
                matr[i][j] = j + 1;
                System.out.print(matr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Разворот на 90 по часовой
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n - 1 - (i * 2); j++) {
                int temp = matr[j + i][n - 1 - i];
                matr[j + i][n - 1 - i] = matr[i][j + i];
                matr[i][j + i] = matr[n - 1 - j - i][i];
                matr[n - 1 - j - i][i] = matr[n - 1 - i][n - 1 - j - i];
                matr[n - 1 - i][n - 1 - j - i] = temp;
            }
        }

        // Разворот на 180 по часовой
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n - 1 - (i * 2); j++) {
                int temp1 = matr[n - 1 - i][n - 1 - i - j];
                matr[n - 1 - i][n - 1 - i - j] = matr[i][j + i];
                matr[i][j + i] = temp1;
                int temp2 = matr[n - 1 - j - i][i];
                matr[n - 1 - j - i][i] = matr[j + i][n - 1 - i];
                matr[j + i][n - 1 - i] = temp2;
            }
        }

        // Разворот на 270 по часовой
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n - 1 - (i * 2); j++) {
                int temp = matr[n - 1 - j - i][i];
                matr[n - 1 - j - i][i] = matr[i][j + i];
                matr[i][j + i] = matr[i + j][n - 1 - i];
                matr[i + j][n - 1 - i] = matr[n - 1 - i][n - 1 - j - i];
                matr[n - 1 - i][n - 1 - j - i] = temp;
            }
        }
        System.out.println();
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr.length; j++) {
                System.out.print(matr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
