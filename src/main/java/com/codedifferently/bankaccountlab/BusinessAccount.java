package com.codedifferently.bankaccountlab;

import java.time.LocalDate;

public class BusinessAccount extends BankAccount {

    private String company;
    private int taxId;

    protected BusinessAccount(Integer acctNum, double balance, double fees, String name, int pin,
                              LocalDate dateOpened, String company, int taxId) {
        super(acctNum, balance, fees, name, pin, dateOpened);
        this.company = company;
        this.taxId = taxId;
    }

    public void setCompany(String company){
        this.company = company;
    }

    public void setTaxId(int taxId){
        this.taxId = taxId;
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

    public int getPin(){
        return pin;
    }

    public String getCompany(){
        return company;
    }

    public int getTaxId(){
        return taxId;
    }

    //ATM Interface methods

    public void deposit(Double money){
        balance += money;
    }

    public void withdrawal(Double money) {
        balance -= money;
    }

}
