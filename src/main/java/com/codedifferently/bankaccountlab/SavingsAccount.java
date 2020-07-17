package com.codedifferently.bankaccountlab;

import java.time.LocalDate;

public class SavingsAccount extends BankAccount{

    private double rate;

    protected SavingsAccount(Integer acctNum, double balance, double fees, String name,
                             LocalDate dateOpened) {
        super(acctNum, balance, fees, name, dateOpened);
        this.rate = rate;
    }

    public void setRate(double rate){
        this.rate = rate;
    }

    public void setName(String name){
        this.name = name;
    }

    public Integer getAcctNum(){
        return acctNum;
    }

    public double getBalance(){
        return balance;
    }

    public double getFees(){
        return fees;
    }

    public String getName(){
        return name;
    }

    public double getRate(){
        return rate;
    }

    public void deposit(Double money){
        balance += money;
    }

    public void withdrawal(Double money) {
        balance -= money;
    }

}
