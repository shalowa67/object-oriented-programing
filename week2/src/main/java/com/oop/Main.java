package com.oop;

public class Main {
    public static void main(String[] args) {
        BankAccount jacobsAccount = new BankAccount();
        BankAccount userAccount = new BankAccount();

        jacobsAccount.accountHolder = "Jacob";
        jacobsAccount.balance = 100;

        System.out.println("Before deposit: " + jacobsAccount.balance);
        jacobsAccount.deposit(100);
        System.out.println("After deposit: " + jacobsAccount.balance);
        System.out.println(userAccount.balance);
    }
}