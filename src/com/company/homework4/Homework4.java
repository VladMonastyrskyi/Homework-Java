package com.company.homework4;

import java.util.Arrays;
import java.util.Scanner;

public class Homework4 {

    public static void main(String[] args) {
        // 1
        for (int i = 1; i < 6; i++) {
            System.out.println(String.format("π = %." + i + "f", Math.PI));
        }

        // 2
        int[] arr = {19, 1040, 123, 958, 62, 252, 2304, 644, 543};
        System.out.println(getMaxNumber(arr));

        // 3
        Scanner in = new Scanner(System.in);
        System.out.print("Введите высоту прямоугольника: ");
        int height = in.nextInt();
        System.out.print("Введите ширину прямоугольника: ");
        int width = in.nextInt();
        drawRectangle(height, width);

        // 4
        String str = "Their classes are usually informal: they learn to read, count and write through different games.";
        System.out.println(getWordCount(str));

        // 5
        String[] words = {"Their", "classes", "are", "usually", "informal"};
        System.out.println(Arrays.toString(wordLengthGt3(words)));
    }

    public static int getMaxNumber(int[] arr) {
        return Arrays.stream(arr).max().getAsInt();
    }

    public static void drawRectangle(int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("+");
            }
            System.out.println();
        }
    }

    public static int getWordCount(String str) {
        return str.split("[,;:.!?\\s]+").length;
    }

    public static String[] wordLengthGt3(String[] arr) {
        return Arrays.stream(arr).filter(str -> str.length() > 3).toArray(String[]::new);
    }
}


