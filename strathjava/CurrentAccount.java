package com.strathjava;

public class CurrentAccount extends BankAccount{
    private double maintenancefee;

    public CurrentAccount(int id, String owner, double balance, double maintenancefee) {
        this.id = id;
        this.owner = owner;
        this.balance = this.checkbalance(balance);
        this.maintenancefee = maintenancefee;


    }
    public void deductMonthly(){

    }
}
