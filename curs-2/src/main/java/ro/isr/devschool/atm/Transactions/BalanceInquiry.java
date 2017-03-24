package ro.isr.devschool.atm.Transactions;

import ro.isr.devschool.atm.BankDatabase;
import ro.isr.devschool.atm.Screen;

/**
 * Created by eduard-gabrielmanda on 16/03/17.
 */

public class BalanceInquiry extends Transaction {

    public BalanceInquiry(BankDatabase bankDatabase, Screen screen, int index) {
        setBankDatabase(bankDatabase);
        setScreen(screen);
        setIndex(index);
    }

    @Override
    public void execute() {
        getScreen().showBalance(getBankDatabase().getAccounts().get(getIndex()).getBalance());
    }
}
