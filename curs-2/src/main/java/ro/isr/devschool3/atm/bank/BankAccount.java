package ro.isr.devschool3.atm.bank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by scipianus on 16-Mar-17.
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BankAccount {
    private int accountNumber;
    private int accountPIN;
    private int balance;

    public BankAccount(int accountNumber, int accountPIN) {
        this.accountNumber = accountNumber;
        this.accountPIN = accountPIN;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    public void withdraw(int amount) {
        this.balance -= amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BankAccount)) return false;

        BankAccount that = (BankAccount) o;

        if (getAccountNumber() != that.getAccountNumber()) return false;
        return getAccountPIN() == that.getAccountPIN();
    }

    @Override
    public int hashCode() {
        int result = getAccountNumber();
        result = 31 * result + getAccountPIN();
        return result;
    }
}
