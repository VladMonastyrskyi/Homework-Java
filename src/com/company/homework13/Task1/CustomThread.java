package com.company.homework13.Task1;

public class CustomThread extends Thread {

    private long start;

    public CustomThread(long start, String name) {
        this.start = start;

        setName(name);
    }

    @Override
    public void run() {
        while (System.currentTimeMillis() - start < 5000) {
            System.out.println(getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
