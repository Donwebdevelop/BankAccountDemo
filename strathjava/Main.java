package com.strathjava;

public class Main {

    public static void main(String[] args) {
	// write your code here


//        BankAccount acc1 = new BankAccount(1000);
        SavingsAccount acc2 = new SavingsAccount(100, "John", 900, 5);
//        acc2.setOwner();

        System.out.println(acc2.getOwner());
        System.out.println(acc2.getId());
        System.out.println(acc2.getBalance());


    }
}
