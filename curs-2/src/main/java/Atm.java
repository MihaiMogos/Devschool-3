import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * Created by Viorica Patrascu on 3/16/2017.
 */
public class Atm {

    private Screen screen;
    private Keypad keypad;

    private CashDispencer cashDispencer;

    private Bankdatabase bankdatabase;
    private Transaction transaction;

    private boolean userAuthenticated;

    @Getter
    private Account currentAccount;

    public Atm() {
        screen = new Screen();
        keypad = new Keypad();
        cashDispencer = new CashDispencer();
        bankdatabase = new Bankdatabase();
        userAuthenticated = false;
    }

    public void run() {
        while (true) {
            while (!userAuthenticated) {
                screen.displayMessage("Welcome!");
                authenticateUser();
            }
            performOperations(currentAccount);

            screen.displayMessage("Goodbuy!");
            userAuthenticated = false;
        }
    }

    private void authenticateUser() {
        screen.displayMessage("Please type your account number.");
        int accountNumber = keypad.readUserInput();

        if (bankdatabase.accountExits(accountNumber)) {
            currentAccount = bankdatabase.getAccount(accountNumber);
            for (int i = 0; i < 3; i++) {
                screen.displayMessage("Please type your pin number.");
                int pin = keypad.readUserInput();
                if (currentAccount.isCorrectPin(pin)) {
                    userAuthenticated = true;
                    return;
                }
                screen.displayMessage("Incorrect pin! Please try agaian.");
            }
            screen.displayMessage("Ooops! Your card is blocked.");
            System.exit(0);

        }
        screen.displayMessage("This account does not exit! Please try again.");

    }

    private boolean accountExists(int accountNumber) {
        boolean exists;
        exists = bankdatabase.accountExits(accountNumber);
        return exists;
    }

    private void performOperations(Account currentAccount) {
        boolean userIsOn = true;
        while (userIsOn) {
        screen.displayATMOptions();
        int option = keypad.readUserInput();
        switch (option) {
            case 1: transaction = new BalanceInquiry(currentAccount);
                    transaction.execute();
                    break;
            case 2: transaction = new Deposit(currentAccount, cashDispencer);
                    transaction.execute();
                    break;
            case 3: transaction = new Withdraw(currentAccount, cashDispencer);
                    transaction.execute();
                    break;
            case 4: userIsOn = false;
                    break;
            default: screen.displayMessage("Invalid option! Please try again.");
                    break;
             }
        }
    }
}
