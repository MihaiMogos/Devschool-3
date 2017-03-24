package ro.isr.devschool.atm;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by eduard-gabrielmanda on 16/03/17.
 */

@AllArgsConstructor
@Getter
public class Account {

    private int accountNumber;
    private int pin;
    private int balance;

    public Account(int accountNumber, int pin) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = 0;
    }

    public boolean deposit(double balance) {
        if (balance > 0) {
            this.balance += balance;
            return true;
        }

        return false;
    }

    public boolean withdraw(double balance) {
        if (this.balance >= balance) {
            this.balance -= balance;
            return true;
        }
        return false;
    }


}
