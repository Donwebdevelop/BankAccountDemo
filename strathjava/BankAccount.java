package com.strathjava;

import java.util.Scanner;

public class BankAccount {
    protected int id;
    protected String owner;
    protected double balance;
    protected double minimumbalance = 1000;

    public BankAccount()
    {
        //default constructor
    }
    public BankAccount(double balance)
    {
        this.balance=balance;

    }

    public double getBalance() {
        return balance;
    }
    public double withdraw(double amount)
    {
        balance = balance-amount;
        return balance;
    }
    public double deposit (float amount)
    {
        balance = balance+amount;
        return balance;
    }
    public String setOwner()
    {
        System.out.print("Enter your Bank Account Name: ");
        Scanner scanner = new Scanner(System.in);
        this.owner = scanner.nextLine();

        System.out.print("Enter your ID number: ");
        Scanner scanner1 = new Scanner(System.in);
        this.id = scanner1.nextInt();

        System.out.print("Enter your balance: ");
        Scanner scanner2 = new Scanner(System.in);
        this.balance = checkbalance(scanner2.nextInt());


        return this.owner;
    }

    protected double checkbalance(double balance){
        while(balance < this.minimumbalance){
            System.out.print("Enter a balance greater than " + this.minimumbalance + ": ");
            Scanner scanner = new Scanner(System.in);
            balance = scanner.nextInt();
        }

        return balance;
    }

    public String getOwner() { return this.owner; }
    public int getId() { return this.id; }

}
