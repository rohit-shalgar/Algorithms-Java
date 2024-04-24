package com.rohit.Interviews.qs;

public class Deadlock {
    private static final Object resource1 = new Object();
    private static final Object resource2 = new Object();

    public static void main(String[] args) {
        Runnable r1 = () -> {
            synchronized (resource1) {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            synchronized (resource2) {
                System.out.println("Thread 1 - resouce 2");
            }
        };
        Runnable r2 = () -> {
            synchronized (resource2) {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            synchronized (resource1) {
                System.out.println("Thread 2 - resouce 1");
            }
        };
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Both threads finished");
    }
}
