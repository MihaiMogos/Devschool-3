import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by ionutmihailescu on 3/16/17.
 */
public class BankDatabase {

    private static List<Account> accounts;

    public BankDatabase(){
        this.accounts=new ArrayList<>();
        accounts.add(new Account(123,123,1000));
        accounts.add(new Account(456,456,2000));
    }


    boolean verifyAccount(int accountName,int pin){
        return  !(accounts.stream().filter(account1 -> account1.getAccountNumber()==accountName&&account1.getPin()==pin).collect(Collectors.toList()).isEmpty());
    }

    static Account getAccount(int accountNumber){
        return accounts.stream().filter(account -> account.getAccountNumber()==accountNumber).findFirst().orElse(null);
    }

}
