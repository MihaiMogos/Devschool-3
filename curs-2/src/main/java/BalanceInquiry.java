/**
 * Created by Viorica Patrascu on 3/16/2017.
 */
public class BalanceInquiry extends Transaction {

    public BalanceInquiry(Account account) {
        super(account);
    }

    public void execute() {
        screen.displayMessage("Your balance is: " + account.getBalance());
    }
}
