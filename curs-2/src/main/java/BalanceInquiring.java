/**
 * Created by ionutmihailescu on 3/16/17.
 */
public class BalanceInquiring extends Transaction {

    public BalanceInquiring(Account account) {
        super(account);
        this.account=account;
    }

    @Override
    void execute() {
        screen.balance(account.getBalance());
    }
}
