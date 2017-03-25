import lombok.Getter;

/**
 * Created by ionutmihailescu on 3/16/17.
 */
public abstract class Transaction {

    Account account;
    Screen screen;
    Keypad keypad;

    public Transaction(Account account) {
        this.screen=new Screen();
        this.keypad=new Keypad();
        this.account=account;

    }

    abstract void execute();

}
