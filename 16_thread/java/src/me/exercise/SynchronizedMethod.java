package me.exercise;

/**
 * Created by chase on 14-12-16.
 */

class SynchronizedClass {
    String name;

    public SynchronizedClass(String name) {
        this.name = name;
    }

    public synchronized void printLoop(String subName) {
        System.out.printf("%s -> %s: starting\n", name, subName);
        try {
            for (int i = 0; i < 10; i++) {
                System.out.printf("%s -> %s: %d\n", name, subName, i);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.printf("%s -> %s: interrupted\n", name, subName);
        } finally {
            System.out.printf("%s -> %s: terminating\n", name, subName);
        }
    }
}

class TestRunnable implements Runnable {
    SynchronizedClass instance;
    String subName;

    public TestRunnable(SynchronizedClass instance, String subName) {
        this.instance = instance;
        this.subName = subName;
    }

    @Override
    public void run() {
        this.instance.printLoop(subName);
    }
}

class SynchronizedMethod {

    public static void main(String [] args) {
        SynchronizedClass instance1 = new SynchronizedClass("SC1");
        SynchronizedClass instance2 = new SynchronizedClass("SC2");

        Thread t1 = new Thread(new TestRunnable(instance1, "t1"));
        Thread t2 = new Thread(new TestRunnable(instance1, "t2"));
        Thread t3 = new Thread(new TestRunnable(instance2, "t3"));

        t1.start();
        t2.start();
        t3.start();
        instance2.printLoop("main");
    }


}
