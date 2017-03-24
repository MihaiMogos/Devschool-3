package ro.isr.devschool.atm;

import lombok.NoArgsConstructor;

/**
 * Created by eduard-gabrielmanda on 16/03/17.
 */
@NoArgsConstructor
public class Screen {


    public void welcome() {
        System.out.println("Welcome");
    }

    public void enterAccNr() {
        System.out.print("Account number: ");
    }

    public void enterPin() {
        System.out.println("Pin:");
    }

    public void invalidLogin() {
        System.out.println("Invalid LOGIN");
    }

    public void showActions() {
        System.out.println("-----------------------------------");
        System.out.println("1. View balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdrawal");
        System.out.println("4. Exit");
        System.out.println("-----------------------------------");
    }

    public void showBalance(int balance) {
        System.out.println("Balance: " + balance);
    }

    public void amount() {
        System.out.println("Amount:");
    }

    public void invalidAmount(){
        System.out.println("Invalid amount");
    }

    public void withdrawActions() {
        System.out.println("-----------------------------------");
        System.out.println("1. 20$");
        System.out.println("2. 40$");
        System.out.println("3. 60$");
        System.out.println("4. 100$");
        System.out.println("5. 200$");
        System.out.println("-----------------------------------");
    }

    public void notEnoughMoneyATM() {
        System.out.println("Not enough money ATM");
    }


}
