package com.evenstein.exercise.concurrency;

/**
 * Created by evenstein on 20.02.17.
 */
public class Account {

    private int balance;

    public Account(int initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public void deposit(int amount) {
        balance += amount;
    }

}
