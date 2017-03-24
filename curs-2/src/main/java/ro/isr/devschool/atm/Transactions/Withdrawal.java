package ro.isr.devschool.atm.Transactions;

import lombok.Setter;
import ro.isr.devschool.atm.BankDatabase;
import ro.isr.devschool.atm.CashDispenser;
import ro.isr.devschool.atm.Keypad;
import ro.isr.devschool.atm.Screen;

/**
 * Created by eduard-gabrielmanda on 16/03/17.
 */
public class Withdrawal extends Transaction {
    @Setter
    Keypad keypad;
    @Setter
    CashDispenser cashDispenser;

    public Withdrawal(BankDatabase bankDatabase, Screen screen, int index, Keypad keypad, CashDispenser cashDispenser) {
        setBankDatabase(bankDatabase);
        setScreen(screen);
        setIndex(index);
        setKeypad(keypad);
        setCashDispenser(cashDispenser);
    }

    @Override
    public void execute() {
        int amount = 0;
        int choice = keypad.getKey();
        switch (choice) {
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
        }
        if (amount > cashDispenser.getBalance()) {
            getScreen().notEnoughMoneyATM();
            return;
        }
        if (!getBankDatabase().getAccounts().get(getIndex()).withdraw(amount)) {
            getScreen().invalidAmount();
        }
        this.cashDispenser.setBalance(this.cashDispenser.getBalance() - amount);

    }
}
