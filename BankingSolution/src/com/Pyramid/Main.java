package com.Pyramid;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        BankAccount newBankAccount = new BankAccount("Ahmad Najad" , 25000);
        System.out.println(newBankAccount.getOwner());

        newBankAccount.withdrawAmount(5000);
        newBankAccount.depositAmount(100000);
        System.out.println(newBankAccount.getBalance());

    }
}
