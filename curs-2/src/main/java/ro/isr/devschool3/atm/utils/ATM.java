package ro.isr.devschool3.atm.utils;

import ro.isr.devschool3.atm.bank.BankAccount;
import ro.isr.devschool3.atm.bank.BankDatabase;
import ro.isr.devschool3.atm.transaction.BalanceInquiry;
import ro.isr.devschool3.atm.transaction.Deposit;
import ro.isr.devschool3.atm.transaction.Transaction;
import ro.isr.devschool3.atm.transaction.Withdrawal;

/**
 * Created by scipianus on 16-Mar-17.
 */
public class ATM {
    private BankDatabase bankDatabase;
    private CashDispenser cashDispenser;
    private KeyPad keyPad;
    private Screen screen;
    private BankAccount currentAccount;

    public ATM() {
        bankDatabase = new BankDatabase();
        cashDispenser = new CashDispenser();
        keyPad = new KeyPad();
        screen = new Screen();
        currentAccount = null;
    }

    public void run() {
        sayGreeting();
    }

    private void sayGreeting() {
        screen.display("Welcome!");
        screen.display("Please enter your account number:");
        int accountNumber = keyPad.getNextInput();
        screen.display("Please introduce your PIN:");
        int pin = keyPad.getNextInput();
        while (pin < 1000 || 9999 < pin) {
            screen.display("Invalid PIN! Please enter your PIN:");
            pin = keyPad.getNextInput();
        }
        checkAccount(accountNumber, pin);
    }

    private void checkAccount(int accountNumber, int pin) {
        if (!bankDatabase.hasAccount(new BankAccount(accountNumber, pin))) {
            screen.display("Incorrect account number and/or PIN! Please try again");
            sayGreeting();
            return;
        }
        currentAccount = new BankAccount(accountNumber, pin);
        screen.display("Welcome to your account!");
        showMainOptions();
    }

    private void showMainOptions() {
        displayOptions();
        waitCommand();
    }

    private void displayOptions() {
        screen.display("Choose one of the following actions:");
        screen.display("1 - Balance Inquiry");
        screen.display("2 - Withdrawal");
        screen.display("3 - Deposit");
        screen.display("4 - Exit");
    }

    private void waitCommand() {
        int command = keyPad.getNextInput();
        Transaction transaction;
        switch (command) {
            case 1:
                transaction = new BalanceInquiry(bankDatabase, screen, currentAccount);
                break;
            case 2:
                transaction = new Withdrawal(bankDatabase, cashDispenser, keyPad, screen, currentAccount);
                break;
            case 3:
                transaction = new Deposit(bankDatabase, keyPad, screen, currentAccount);
                break;
            case 4:
                exitAccount();
                return;
            default:
                screen.display("Invalid option selected! Please try again");
                showMainOptions();
                return;
        }
        transaction.run();
        showMainOptions();
    }

    private void exitAccount() {
        currentAccount = null;
        screen.display("Goodbye!");
        sayGreeting();
    }

}
