package ro.isr.devschool3.atm.transaction;

import lombok.AllArgsConstructor;
import ro.isr.devschool3.atm.bank.BankAccount;
import ro.isr.devschool3.atm.bank.BankDatabase;
import ro.isr.devschool3.atm.utils.CashDispenser;
import ro.isr.devschool3.atm.utils.KeyPad;
import ro.isr.devschool3.atm.utils.Screen;

/**
 * Created by scipianus on 16-Mar-17.
 */
@AllArgsConstructor
public class Withdrawal implements Transaction {
    private BankDatabase bankDatabase;
    private CashDispenser cashDispenser;
    private KeyPad keyPad;
    private Screen screen;
    private BankAccount currentAccount;

    @Override
    public void run() {
        withdrawal();
    }

    private void withdrawal() {
        displayOptionsForWithdrawal();
        waitWithdrawalCommand();
    }

    private void displayOptionsForWithdrawal() {
        screen.display("Please select one of the options:");
        screen.display("1 - 20$");
        screen.display("2 - 40$");
        screen.display("3 - 60$");
        screen.display("4 - 100$");
        screen.display("5 - 200$");
        screen.display("6 - Cancel transaction");
    }

    private void waitWithdrawalCommand() {
        int command = keyPad.getNextInput();
        int amount = 0;
        switch (command) {
            case 1:
                amount = 20;
                break;
            case 2:
                amount = 40;
                break;
            case 3:
                amount = 60;
                break;
            case 4:
                amount = 100;
                break;
            case 5:
                amount = 200;
                break;
            case 6:
                return;
            default:
                screen.display("Invalid option selected! Please try again");
                withdrawal();
                return;
        }
        if (cashDispenser.getCashAvailable() < amount) {
            screen.display("Insufficient cash in the dispenser! Please enter a lower amount");
            withdrawal();
            return;
        }
        if (!bankDatabase.hasEnoughMoney(currentAccount, amount)) {
            screen.display("Insufficient money amount in your account! Please enter a lower amount");
            withdrawal();
            return;
        }
        bankDatabase.withdraw(currentAccount, amount);
        cashDispenser.withdraw(amount);
        screen.display("The withdrawal was successful!");
    }
}
