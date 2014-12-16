package me.exercise;

import java.util.Random;
import java.util.concurrent.Semaphore;

/**
 * Created by chase on 14-12-16.
 */

class SemaphoreProjected {
    public Semaphore sem1, sem2, sem3;

    public SemaphoreProjected() {
        sem1 = new Semaphore(1);
        sem2 = new Semaphore(1);
        sem3 = new Semaphore(1);

        try {
            sem1.acquire();
            sem2.acquire();
            sem3.acquire();
        } catch (InterruptedException e) {
            System.out.println("Acquire interrupted");
        }
    }

    public void first() {
        try {
            Random rand = new Random();
            System.out.println("Exec first");
            Thread.sleep(100 + rand.nextInt(300));
            System.out.println("Exec first finished");
            sem1.release();
        } catch (InterruptedException e) {
            System.out.println("Exec first interrupted");
        }
    }

    public void second() {
        try {
            sem1.acquire();
            sem1.release();
            Random rand = new Random();
            System.out.println("Exec second");
            Thread.sleep(100 + rand.nextInt(300));
            System.out.println("Exec second finished");
            sem2.release();
        } catch (InterruptedException e) {
            System.out.println("Exec second interrupted");
        }
    }

    public void third() {
        try {
            sem2.acquire();
            sem2.release();
            Random rand = new Random();
            System.out.println("Exec third");
            Thread.sleep(100 + rand.nextInt(300));
            System.out.println("Exec third finished");
            sem3.release();
        } catch (InterruptedException e) {
            System.out.println("Exec third interrupted");
        }
    }
}

public class TestSemaphore {
    public static void main(String[] args) {
        final SemaphoreProjected sp = new SemaphoreProjected();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                sp.first();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                sp.second();
            }
        });
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                sp.third();
            }
        });

        t3.start();
        t2.start();
        t1.start();
    }
}
