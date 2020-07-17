package com.codedifferently.bankaccountlab;

import java.time.LocalDate;

public class CheckingAccount extends BankAccount{

    protected CheckingAccount(Integer acctNum, double balance, double fees, String name, LocalDate dateOpened) {
        super(acctNum, balance, fees, name, dateOpened);
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

    public void deposit(Double money){
        balance += money;
    }

    public void withdrawal(Double money) {
        balance -= money;
    }
}
