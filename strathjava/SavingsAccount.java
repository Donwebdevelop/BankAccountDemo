package com.strathjava;

import java.util.Scanner;

public class SavingsAccount extends BankAccount {

    private double interestRate;
    private int interest;

    public SavingsAccount() {

        // default constructor
    }

    public SavingsAccount(int id, String owner, double balance, double interestRate) {
        this.id = id;
        this.owner = owner;
        this.balance = this.checkbalance(balance);
        this.interestRate = interestRate;


    }

    public void addMonthlyInterest(double rate){
        System.out.println(rate);
    }
}
