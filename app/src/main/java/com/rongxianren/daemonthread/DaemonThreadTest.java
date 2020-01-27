package com.rongxianren.daemonthread;

public class DaemonThreadTest {

    private static int count = 0;

    public static void main(String[] args) {

        Thread thread = new Thread(() -> {
            while (true) {
                try {
                    Thread.currentThread().sleep(500);
                    System.out.println("这是守护线程 = " + (count++));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.setDaemon(true);
        thread.start();
        try {
            Thread.currentThread().sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("主线程已经结束");


    }
}
