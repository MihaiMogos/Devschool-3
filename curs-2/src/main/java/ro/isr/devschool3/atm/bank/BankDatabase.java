package ro.isr.devschool3.atm.bank;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by scipianus on 16-Mar-17.
 */
public class BankDatabase {
    private Set<BankAccount> bankAccounts;

    public BankDatabase() {
        bankAccounts = new HashSet<>();
        bankAccounts.add(new BankAccount(123, 1234, 1000));
        bankAccounts.add(new BankAccount(456, 4567, 500));
        bankAccounts.add(new BankAccount(789, 7890, 199));
    }

    public boolean hasAccount(BankAccount bankAccount) {
        return bankAccounts.stream().anyMatch(x -> x.equals(bankAccount));
    }

    public int balanceInquiry(BankAccount bankAccount) {
        return getBankAccount(bankAccount).getBalance();
    }

    public void deposit(BankAccount bankAccount, int amount) {
        if (hasAccount(bankAccount)) {
            getBankAccount(bankAccount).deposit(amount);
        }
    }

    public boolean hasEnoughMoney(BankAccount bankAccount, int amount) {
        return balanceInquiry(bankAccount) >= amount;
    }

    public void withdraw(BankAccount bankAccount, int amount) {
        if (hasEnoughMoney(bankAccount, amount)) {
            getBankAccount(bankAccount).withdraw(amount);
        }
    }

    private BankAccount getBankAccount(BankAccount bankAccount) {
        return bankAccounts.stream().filter(x -> x.equals(bankAccount)).findFirst().orElse(new BankAccount());
    }
}
