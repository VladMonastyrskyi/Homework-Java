package com.company.homework6;

import java.util.Scanner;

public class Homework6 {

    public static void main(String[] args) {
        Present present = new Present();

        System.out.println("Содержимое подарка\n" + present.getContent());
        System.out.println("\nВес содержимого подарка " + present.getWeight() + " грамм");
        System.out.println("\nОтсортированное содержимое подарка по весу\n" + present.sortByWeight());
        System.out.println("\nОтсортированное содержимое подарка по количеству сахара\n" + present.sortBySugar());
        System.out.println("\nОтсортированное содержимое подарка по имени\n" + present.sortByName());

        Scanner in = new Scanner(System.in);
        System.out.println("\nВведите диапазон содержания сахара");
        System.out.print("От ");
        double from = in.nextDouble();
        System.out.print("До ");
        double to = in.nextDouble();
        System.out.println("Содержимое подарка\n" + (present.getContentByRangeOfSugar(from, to)));

        /*
        Результат

        Содержимое подарка
        [Sweet{weight=240.0, sugar=56.0, name='Конфеты АВК Шоколадная ночь'},
         Sweet{weight=130.0, sugar=28.0, name='Конфеты Красный мак'},
         Sweet{weight=190.0, sugar=45.0, name='Конфеты Candy Nut Карамель'},
         Sweet{weight=90.0, sugar=32.0, name='Шоколад Roshen чёрный'}]

        Вес содержимого подарка 650.0 грамм

        Отсортированное содержимое подарка по весу
        [Sweet{weight=90.0, sugar=32.0, name='Шоколад Roshen чёрный'},
         Sweet{weight=130.0, sugar=28.0, name='Конфеты Красный мак'},
         Sweet{weight=190.0, sugar=45.0, name='Конфеты Candy Nut Карамель'},
         Sweet{weight=240.0, sugar=56.0, name='Конфеты АВК Шоколадная ночь'}]

        Отсортированное содержимое подарка по количеству сахара
        [Sweet{weight=130.0, sugar=28.0, name='Конфеты Красный мак'},
         Sweet{weight=90.0, sugar=32.0, name='Шоколад Roshen чёрный'},
         Sweet{weight=190.0, sugar=45.0, name='Конфеты Candy Nut Карамель'},
         Sweet{weight=240.0, sugar=56.0, name='Конфеты АВК Шоколадная ночь'}]

        Отсортированное содержимое подарка по имени
        [Sweet{weight=190.0, sugar=45.0, name='Конфеты Candy Nut Карамель'},
         Sweet{weight=240.0, sugar=56.0, name='Конфеты АВК Шоколадная ночь'},
         Sweet{weight=130.0, sugar=28.0, name='Конфеты Красный мак'},
         Sweet{weight=90.0, sugar=32.0, name='Шоколад Roshen чёрный'}]

        Введите диапазон содержания сахара
        От 32
        До 46
        Содержимое подарка
        [Sweet{weight=190.0, sugar=45.0, name='Конфеты Candy Nut Карамель'},
         Sweet{weight=90.0, sugar=32.0, name='Шоколад Roshen чёрный'}]
        */
    }
}
