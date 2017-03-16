package ro.isr.devschool3.atm.transaction;

import lombok.AllArgsConstructor;
import ro.isr.devschool3.atm.bank.BankAccount;
import ro.isr.devschool3.atm.bank.BankDatabase;
import ro.isr.devschool3.atm.utils.Screen;

/**
 * Created by scipianus on 16-Mar-17.
 */
@AllArgsConstructor
public class BalanceInquiry implements Transaction {
    private BankDatabase bankDatabase;
    private Screen screen;
    private BankAccount currentAccount;

    @Override
    public void run() {
        screen.displayFormatted("Total balance: $%d.00\n", bankDatabase.balanceInquiry(currentAccount));
    }
}
