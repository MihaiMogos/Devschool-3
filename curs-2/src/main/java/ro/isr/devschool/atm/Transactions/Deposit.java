package ro.isr.devschool.atm.Transactions;

import lombok.Setter;
import ro.isr.devschool.atm.BankDatabase;
import ro.isr.devschool.atm.Keypad;
import ro.isr.devschool.atm.Screen;

/**
 * Created by eduard-gabrielmanda on 16/03/17.
 */
@Setter
public class Deposit extends Transaction {
    private Keypad keypad;

    public Deposit(BankDatabase bankDatabase, Screen screen, int index, Keypad keypad) {
        super(bankDatabase, screen, index);
        setKeypad(keypad);
    }

    @Override
    public void execute() {
        getScreen().amount();
        int amount = keypad.getKey();

        if (!getBankDatabase().getAccounts().get(getIndex()).deposit(amount)) {
            getScreen().invalidAmount();
        }
    }
}
