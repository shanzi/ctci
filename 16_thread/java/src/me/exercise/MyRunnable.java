package me.exercise;

/**
 * Created by chase on 14-12-16.
 */
class CustomRunnable implements Runnable{
    String name;

    public CustomRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.printf("%s: Runnable Starting\n", name);
        try {
            int count = 0;
            while (count < 10) {
                System.out.printf("%s: %d\n", name, count);
                Thread.sleep(500);
                count++;
            }
        } catch (InterruptedException exc) {
            System.out.printf("%s: Runnable interrupted\n", name);
        } finally {
            System.out.printf("%s: Runnable terminating\n", name);
        }
    }
}

class MyRunnable {
    public static void main(String[] args) throws InterruptedException {
        CustomRunnable runable1 = new CustomRunnable("R1");
        CustomRunnable runable2 = new CustomRunnable("R2");
        CustomRunnable runable3 = new CustomRunnable("R3");

        Thread t1 = new Thread(runable1);
        Thread t2 = new Thread(runable2);
        Thread t3 = new Thread(runable3);

        t1.start();
        t2.start();
        t3.start();

        Thread.sleep(5000);
    }
}
