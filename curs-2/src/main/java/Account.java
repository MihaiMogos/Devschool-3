import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.security.Key;

/**
 * Created by Viorica Patrascu on 3/16/2017.
 */
public class Account {

    @Setter @Getter
    private int accountNumber;

    @Setter @Getter
    private int pin;

    @Getter
    private Integer balance;

    private Screen screen;

    public Account(int accountNumber, int pin, int balance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;

        screen = new Screen();
    }

    public void increaseBalance(int amount) {
        this.balance += amount;
    }

    public boolean decreaseBalance(int amount) {
        if (balance >= amount) {
            this.balance -= amount;
            return true;
        }
        return false;
    }

    public boolean isCorrectPin(int pin) {
        if (pin == this.pin) {
            return true;
        }
        return false;
    }
}
