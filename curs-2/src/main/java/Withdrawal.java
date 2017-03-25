/**
 * Created by ionutmihailescu on 3/16/17.
 */
public class Withdrawal  extends Transaction{

    CashDispenser cashDispenser;

    public Withdrawal(Account account,CashDispenser cashDispenser) {
        super(account);
        this.cashDispenser = cashDispenser;
    }

    @Override
    void execute() {
        screen.withdrawalOptions();
        int sum = keypad.readOption();
        switch (sum) {
            case 1:
                if (account.getBalance() >= 20 && cashDispenser.getCashAvailable() >= 1) {
                    account.withdrawal(20);
                    cashDispenser.eliminateCash(1);
                } else
                    screen.error();
                break;
            case 2:
                if (account.getBalance() >= 40 && cashDispenser.getCashAvailable() >= 2) {
                    account.withdrawal(40);
                    cashDispenser.eliminateCash(2);
                } else
                    screen.error();
                break;
            case 3:
                if (account.getBalance() >= 60 && cashDispenser.getCashAvailable() >= 3) {
                    account.withdrawal(60);
                    cashDispenser.eliminateCash(3);
                } else
                    screen.error();
                break;
            case 4:
                if (account.getBalance() >= 100 && cashDispenser.getCashAvailable() >= 5) {
                    account.withdrawal(100);
                    cashDispenser.eliminateCash(5);
                } else
                    screen.error();
                break;
            case 5:
                if (account.getBalance() >= 200 && cashDispenser.getCashAvailable() >= 10) {
                    account.withdrawal(200);
                    cashDispenser.eliminateCash(10);
                } else
                    screen.error();
                break;


        }
    }
}
