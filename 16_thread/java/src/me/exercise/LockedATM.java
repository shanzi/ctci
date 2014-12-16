package me.exercise;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by chase on 14-12-16.
 */


class ATM {
    private Lock lock;
    private int balance = 100;

    public ATM() {
        lock = new ReentrantLock();
    }

    public void withdraw(int value) {
        lock.lock();
        int temp = balance;
        try {
            System.out.printf("Will withdraw %d from %d\n", value, temp);
            Thread.sleep(100);
            if (temp > value) {
                temp -= value;
                Thread.sleep(100);
                balance = temp;
                System.out.printf("Withdraw %d from %d succeeded\n", value, temp);
            } else {
                System.out.printf("Can not withdraw %d from %d\n", value, temp);
            }
        } catch (InterruptedException e) {
            System.out.println("Withdrawing interrupted");
        }  finally {
            System.out.println("Withdrawing terminated");
            lock.unlock();
        }
    }

    public void deposit(int value) {
        lock.lock();
        int temp = balance;
        try {
            System.out.printf("Will deposit %d from %d\n", value, temp);
            Thread.sleep(100);
            temp += value;
            Thread.sleep(100);
            balance = temp;
            System.out.printf("Deposit %d from %d succeeded\n", value, temp);
        } catch (InterruptedException e) {
            System.out.println("Depositing interrupted");
        } finally {
            System.out.println("Depositing terminated");
            lock.unlock();
        }
    }
}

class ATMRunnable implements Runnable {
    ATM atmInstance;

    public ATMRunnable(ATM atmInstance) {
        this.atmInstance = atmInstance;
    }

    @Override
    public void run() {
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int value = 10 + rand.nextInt(100);
            try {
                Thread.sleep(50 + rand.nextInt(50));
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
            if (rand.nextBoolean()) {
                atmInstance.withdraw(value + 100);
            } else {
                atmInstance.deposit(value);
            }
        }
    }
}

public class LockedATM {

    public static void main(String[] args) throws InterruptedException {
        ATM atm = new ATM();
        for (int i = 0; i < 5; i++) {
            Thread t = new Thread(new ATMRunnable(atm));
            t.start();
        }
        Thread.sleep(5000);
    }
}
