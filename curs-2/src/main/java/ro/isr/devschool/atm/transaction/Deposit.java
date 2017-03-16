package ro.isr.devschool.atm.transaction;

import ro.isr.devschool.atm.BankDatabase;
import ro.isr.devschool.atm.Keypad;
import ro.isr.devschool.atm.Screen;

public class Deposit extends Transaction {
    private final static int CANCELED = 0;
    private double amount;
    private Keypad keypad;

    public Deposit(int accountNumber, Screen screen, BankDatabase bankDatabase, Keypad keypad) {
        super(accountNumber, screen, bankDatabase);
        this.keypad = keypad;
    }

    @Override
    public void execute() {
        BankDatabase bankDatabase = getBankDatabase();
        Screen screen = getScreen();

        amount = promptForDepositAmount();

        if (amount != CANCELED) {
            screen.displayMessage("\nPlease credit my account with ");
            screen.displayDollarAmount(amount);
            screen.displayMessageLine(".");

            bankDatabase.credit(getAccountNumber(), amount);
            screen.displayMessageLine("\nYour account has been credited");
        } else {
            screen.displayMessageLine("\nCanceling transaction...");
        }
    }

    private double promptForDepositAmount() {
        Screen screen = getScreen();
        screen.displayMessage("\nPlease enter a deposit amount in CENTS (or 0 to cancel): ");

        int input = keypad.getInput();
        if (input == CANCELED) {
            return CANCELED;
        } else {
            return (double) input / 100;
        }
    }
}