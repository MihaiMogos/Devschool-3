import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Viorica Patrascu on 3/16/2017.
 */
public class Bankdatabase {
    private List<Account> accounts;

    public Bankdatabase() {
        accounts = new ArrayList<Account>();
        accounts.add(new Account(1234, 4874, 200));
        accounts.add(new Account(4586, 4804, 400));
        accounts.add(new Account(8975, 4009, 100));
    }

    public boolean accountExits(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return true;
            }
        }
        return false;
    }

    public Account getAccount(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }
}
