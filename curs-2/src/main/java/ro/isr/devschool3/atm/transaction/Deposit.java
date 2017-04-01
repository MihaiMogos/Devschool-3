package ro.isr.devschool3.atm.transaction;

import lombok.AllArgsConstructor;
import ro.isr.devschool3.atm.bank.BankAccount;
import ro.isr.devschool3.atm.bank.BankDatabase;
import ro.isr.devschool3.atm.utils.KeyPad;
import ro.isr.devschool3.atm.utils.Screen;

/**
 * Created by scipianus on 16-Mar-17.
 */
@AllArgsConstructor
public class Deposit implements Transaction {
    private BankDatabase bankDatabase;
    private KeyPad keyPad;
    private Screen screen;
    private BankAccount currentAccount;

    @Override
    public void run() {
        screen.display("Please enter the amount you want to deposit");
        int amount = keyPad.getNextInput();
        while (amount <= 0) {
            screen.display("Invalid amount entered! Please try again");
            amount = keyPad.getNextInput();
        }
        bankDatabase.deposit(currentAccount, amount);
        screen.display("Successful deposit!");
    }

}
