package com.company.homework13.Task1;

public class CustomRunnable implements Runnable {

    private long start;

    public CustomRunnable(long start) {
        this.start = start;
    }

    @Override
    public void run() {
        while (System.currentTimeMillis() - start < 5000) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
