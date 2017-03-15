package com.evenstein.exercise.concurrency;

/**
 * Created by evenstein on 20.02.17.
 */
public class Operations {

    public static void main(String... args) {
        final Account a = new Account(1000);
        final Account b = new Account(2000);

            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        transfer(a, b, 500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }).start();
        try {
            transfer(b, a, 300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    static void transfer(Account account1, Account account2, int amount)
            throws InterruptedException {

        synchronized (account1) {
            Thread.sleep(1000);
            synchronized (account2) {
                account1.withdraw(amount);
                account2.deposit(amount);
                System.out.println("Transfer sucsess");
            }
        }


    }

}
