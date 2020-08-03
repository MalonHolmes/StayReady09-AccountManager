package com.codedifferently.bankaccountlab;

import java.util.Scanner;

/**
 * This class is the entry point of the ATM
 * This class utilizes the main() and Scanner
 * to allow the user to interact with your ATM.
 * A user should be able to create, view and delete accounts.
 */
public class MainApplication {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        // Greetings to the user
        System.out.println("______GREETINGS AND WELCOME TO THE AUTOMATED TELLER MACHINE (ATM)______\n");

        System.out.println("What can I help you with today?\n CREATE ACCOUNT || VIEW ACCOUNT || DELETE ACCOUNT");

        // Create an account
        System.out.println("What kind of account would you like to create?\n" +
                "____CHECKING____\n" +
                "____SAVINGS____\n" +
                "____BUSINESS____");


    }
}
