package ro.isr.devschool.poo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by crist on 16-Mar-17.
 */
public class BankDatabase {
    private List<Account<Integer, Integer, Integer>> accounts = new ArrayList<>();

    public void addAccounts() {
        this.accounts.add(new Account(1234, 1234, 1000));
        this.accounts.add(new Account(555, 1234, 200));
    }

    public List<Account<Integer, Integer, Integer>> getAccounts() {
        return accounts;
    }
}
