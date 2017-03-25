import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by ionutmihailescu on 3/16/17.
 */
public class Account {

    private int accountNumber;
    private int pin;
    private int balance;

    public Account(int accountNumber, int pin,int balance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance=balance;
    }

    void withdrawal(int sum){
        if (sum<=balance){
            balance-=sum;
            System.out.println("Succes!");
        }
        else
            System.out.print("Not enough founds");

    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getPin() {
        return pin;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance+=amount;
        System.out.println("Succes!");
    }

    public void viewBalance(){
        System.out.println("Your balance is: "+this.balance);
    }
}
