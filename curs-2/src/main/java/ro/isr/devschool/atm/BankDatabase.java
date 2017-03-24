package ro.isr.devschool.atm;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by eduard-gabrielmanda on 16/03/17.
 */
@AllArgsConstructor
@Getter
public class BankDatabase {

    private String name;
    private List<Account> accounts;

    public BankDatabase(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();//....
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public int findUser(int accNr, int pin) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getPin() == pin && accounts.get(i).getAccountNumber() == accNr) {
                return i;
            }
        }
        return -1;
    }


}
