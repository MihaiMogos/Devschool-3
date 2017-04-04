package ro.isr.devschool3.atm.utils;

import lombok.Getter;

/**
 * Created by scipianus on 16-Mar-17.
 */
@Getter
public class CashDispenser {
    private static final int INITIAL_CASH_AVAILABLE = 1000;
    private int cashAvailable;

    public CashDispenser() {
        cashAvailable = INITIAL_CASH_AVAILABLE;
    }

    public void withdraw(int amount) {
        cashAvailable -= amount;
    }
}
