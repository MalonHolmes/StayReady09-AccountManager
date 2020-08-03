package com.codedifferently.bankaccountlab;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

public class SavingsAccountTest {

    SavingsAccount sa1;
    SavingsAccount sa2;

    @Before
    public void setup(){
        sa1 = new SavingsAccount();
        sa2 = new SavingsAccount(1,100.0,10.0,
                "Reuel", 1234, 0.1, LocalDate.now());
    }

    @Test
    public void defaultConstructorTest(){
        // Given

        // When

        // Then
        Assert.assertTrue(sa1 instanceof SavingsAccount);

    }

    @Test
    public void nonDefaultConstructorTest(){
        // Given

        // When

        // Then
        Assert.assertTrue(sa2 instanceof SavingsAccount);

    }

    @Test
    public void getAcctNumTest(){
        // Given
        Integer expected = 1;

        // When
        Integer actual = sa1.getAcctNum();

        // Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getRateTest(){
        // Given
        Double expected = 0.1;

        // When
        Double actual = sa1.getRate();

        // Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getNameTest(){
        // Given
        String expected = "Reuel";

        // When
        String actual = sa1.getName();

        // Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getBalanceTest(){
        // Given
        Double expected = 0.0;

        // When
        Double actual = sa1.getBalance();

        // Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getFeesTest(){
        // Given
        Double expected = 10.0;

        // When
        Double actual = sa1.getFees();

        // Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getPinTest(){
        // Given
        Integer expected = 1234;

        // When
        Integer actual = sa1.getPin();

        // Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setRateTest(){
        // Given
        Double expected = 0.2;

        // When
        sa1.setRate(0.2);
        Double actual = sa1.getRate();

        // Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setNameTest(){
        // Given
        String expected = "Reuel Jr.";

        // When
        sa1.setName("Reuel Jr.");
        String actual = sa1.getName();

        // Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setPinTest(){
        // Given
        Integer expected = 4321;

        // When
        sa1.setPin(4321);
        Integer actual = sa1.getPin();

        // Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void depositTest(){
        // Given
        Double expected = 110.0;

        // When
        sa2.deposit(10.0);
        Double actual = sa2.getBalance();

        // Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void withdrawalTest(){
        // Given
        Double expected = 90.0;

        // When
        sa2.withdrawal(10.0);
        Double actual = sa2.getBalance();

        // Then
        Assert.assertEquals(expected,actual);
    }
}
