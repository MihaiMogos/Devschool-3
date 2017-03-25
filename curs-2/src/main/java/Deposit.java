/**
 * Created by ionutmihailescu on 3/16/17.
 */
public class Deposit  extends Transaction{

    public Deposit(Account account) {
        super(account);
    }

    @Override
    void execute() {
        screen.deposit();
        int amount=keypad.readOption();
        account.deposit(amount);
    }
}
