package com.codedifferently.bankaccountlab;

import java.time.LocalDate;

public class SavingsAccount extends BankAccount{

    private double rate;

    protected SavingsAccount(){
        this(1,0.0,10.0,
                "Reuel", 1234, 0.1, LocalDate.now());
    }

    protected SavingsAccount(Integer acctNum, double balance, double fees, String name,
                             int pin,double rate, LocalDate dateOpened) {
        super(acctNum, balance, fees, name, pin, dateOpened);
        this.rate = rate;
    }

    public void setRate(double rate){
        this.rate = rate;
    }

    public void setName(String name){
         this.name = name;
    }

    public void setPin(int pin){
        this.pin = pin;
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

    public int getPin() { return pin;}

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
