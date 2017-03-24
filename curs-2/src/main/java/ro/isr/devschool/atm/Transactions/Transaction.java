package ro.isr.devschool.atm.Transactions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ro.isr.devschool.atm.BankDatabase;
import ro.isr.devschool.atm.Screen;

/**
 * Created by eduard-gabrielmanda on 16/03/17.
 */
@AllArgsConstructor
@Setter
@Getter
public abstract class Transaction {

    private BankDatabase bankDatabase;
    private Screen screen;
    private int index;

    public Transaction() {

    }



    public abstract void execute();
}
