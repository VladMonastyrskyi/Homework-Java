package com.company.homework13.Task2;

import java.util.Scanner;
import java.util.concurrent.LinkedBlockingQueue;

public class Spam extends Thread {

    private LinkedBlockingQueue<Integer> messageDelay;
    private LinkedBlockingQueue<String> messages;

    public Spam(LinkedBlockingQueue<Integer> messageDelay, LinkedBlockingQueue<String> messages) {
        this.messageDelay = messageDelay;
        this.messages = messages;
    }

    @Override
    public void run() {
        new Thread(() -> {
            Scanner in = new Scanner(System.in);
            while (true) {
                if (in.nextLine().equals("")) {
                    Spam.this.interrupt();
                    break;
                }
            }
        }).start();

        try {
            while (!messageDelay.isEmpty() || !messages.isEmpty()) {
                Thread.sleep(messageDelay.remove());
                System.out.println(messages.remove());
            }
        } catch (InterruptedException e) {
            System.out.println("Pressed ENTER");
        }
    }
}
