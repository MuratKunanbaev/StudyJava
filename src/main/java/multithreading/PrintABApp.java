package multithreading;

import java.util.TreeMap;

public class PrintABApp {
    private final Object mon = new Object();
    private volatile char currentLetter = 'A';

    public static void main(String[] args) {
        PrintABApp waitNotifyApp = new PrintABApp();
        Thread thread1 = new Thread(() -> {
            waitNotifyApp.printA();
        });

        Thread thread2 = new Thread(() -> {
            waitNotifyApp.printB();
        });

        thread1.start();
        thread2.start();
    }

    public void printA() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 10; i++) {
                    while (currentLetter != 'A') {
                        mon.wait();
                    }
                    System.out.print("A");
                    currentLetter = 'B';
                    mon.notify();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printB() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 10; i++) {
                    while (currentLetter != 'B') {
                        mon.wait();
                    }
                    System.out.print("B");
                    currentLetter = 'A';
                    mon.notify();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
