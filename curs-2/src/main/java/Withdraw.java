/**
 * Created by Viorica Patrascu on 3/16/2017.
 */
public class Withdraw extends Transaction {

    private CashDispencer cashDispencer;

    private Keypad keypad;

    public Withdraw(Account account, CashDispencer cashDispencer) {
        super(account);
        this.cashDispencer = cashDispencer;

        keypad = new Keypad();
    }

    public void execute() {
        screen.displayMessage("How much do you want to withdraw?");
        screen.displayWithdrawOptions();
        int amount = keypad.readUserInput();
        if (cashDispencer.hasEnoughCash(amount)) {
            switch (amount) {
                case 1: if (account.decreaseBalance(20)) {
                            cashDispencer.decreaseAvailableCash(20);
                            screen.displayMessage("Operation ended with success.");}
                        else {
                             screen.displayMessage("Not enough money in your account.");
                        }
                         break;
                case 2: if (account.decreaseBalance(40)) {
                            cashDispencer.decreaseAvailableCash(40);
                            screen.displayMessage("Operation ended with success.");
                        } else {
                            screen.displayMessage("Not enough money in your account.");
                        }
                        break;
                case 3: if (account.decreaseBalance(60)) {
                            cashDispencer.decreaseAvailableCash(60);
                            screen.displayMessage("Operation ended with success.");
                        } else {
                            screen.displayMessage("Not enough money in your account.");
                        }
                        break;
                case 4: if (account.decreaseBalance(100)) {
                            cashDispencer.decreaseAvailableCash(100);
                            screen.displayMessage("Operation ended with success.");
                        } else {
                            screen.displayMessage("Not enough money in your account.");
                        }
                        break;
                case 5: if (account.decreaseBalance(200)) {
                            cashDispencer.decreaseAvailableCash(200);
                            screen.displayMessage("Operation ended with success.");
                         }
                        else {
                            screen.displayMessage("Not enough money in your account.");
                        }
                        break;
                default: screen.displayMessage("Invalid option! Please try again.");
            }
            return;
        }
        screen.displayMessage("Not enough cash available in the ATM.");
    }
}
