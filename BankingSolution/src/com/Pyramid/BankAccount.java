package com.Pyramid;

public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }
    public double withdrawAmount(double amt) {
        this.balance = balance - amt;
        return balance;
    }
    public double depositAmount(double amt) {
        this.balance = balance + amt;
        return balance;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }
}