/**
 * Created by Viorica Patrascu on 3/16/2017.
 */
public class Deposit extends Transaction {

    private CashDispencer cashDispencer;

    private Keypad keypad;

    public Deposit(Account account, CashDispencer cashDispencer) {
        super(account);
        this.cashDispencer = cashDispencer;

        keypad = new Keypad();
    }

    public void execute() {
        screen.displayMessage("How much do you want to deposit?");
        int amount = keypad.readUserInput();
        account.increaseBalance(amount);
        screen.displayMessage("Operation ended with success.");
    }
}
