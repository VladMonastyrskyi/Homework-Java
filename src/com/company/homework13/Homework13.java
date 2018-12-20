package com.company.homework13;

import com.company.homework13.Task1.CustomRunnable;
import com.company.homework13.Task1.CustomThread;
import com.company.homework13.Task2.Spam;
import com.company.homework13.Task3.Counter;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class Homework13 {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        // 1
        new CustomThread(start, "CustomThread").start();
        new Thread(new CustomRunnable(start), "CustomRunnable").start();

        // 2
        LinkedBlockingQueue<Integer> messageDelay = new LinkedBlockingQueue<>();
        messageDelay.offer(2400);
        messageDelay.offer(800);
        messageDelay.offer(1600);
        messageDelay.offer(3200);
        messageDelay.offer(2000);
        messageDelay.offer(4000);
        LinkedBlockingQueue<String> messages = new LinkedBlockingQueue<>();
        messages.offer("2400");
        messages.offer("800");
        messages.offer("1600");
        messages.offer("3200");
        messages.offer("2000");
        messages.offer("4000");
        new Spam(messageDelay, messages).start();

        // 3
        Counter counter = new Counter();
        getAndIncrementCounters(start, counter);
        getAndIncrementCounters(start, counter);

        // 4
        int rows = 4;
        int columns = 100;
        Thread[] threads = new Thread[rows];
        AtomicInteger normalMax = new AtomicInteger(0);
        AtomicInteger threadMax = new AtomicInteger(0);
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            int index = i;
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = new Random().nextInt(9999) + 1;
            }
            threads[i] = new Thread(() -> {
                for (int j = 0; j < columns; j++) {
                    if (matrix[index][j] > threadMax.get()) {
                        threadMax.set(matrix[index][j]);
                    }
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }

        long normalStart = System.currentTimeMillis();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] > normalMax.get()) {
                    normalMax.set(matrix[i][j]);
                }
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Time without Threads: " + (System.currentTimeMillis() - normalStart));

        long threadStart = System.currentTimeMillis();
        for (Thread t : threads) {
            t.start();
        }

        while (true) {
            if (!threads[0].isAlive() && !threads[1].isAlive() && !threads[2].isAlive() && !threads[3].isAlive()) {
                System.out.println("Time with Threads: " + (System.currentTimeMillis() - threadStart));
                System.out.println(normalMax.get() + " = " + threadMax.get());
                break;
            }
        }
    }

    private static void getAndIncrementCounters(long start, Counter counter) {
        new Thread(() -> {
            while (System.currentTimeMillis() - start <= 2500) {
                synchronized (counter) {
                    try {
                        System.out.println(counter.getFirstCounter() + " = " + counter.getSecondCounter());
                        counter.incrementFirstCounter();
                        Thread.sleep(10);
                        counter.incrementSecondCounter();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
