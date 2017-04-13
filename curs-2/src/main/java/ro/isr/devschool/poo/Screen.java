package ro.isr.devschool.poo;

/**
 * Created by crist on 16-Mar-17.
 */
public class Screen {
    public void showWelcome(){
        System.out.println("Welcome!");
        System.out.print("Please enter your account number: ");
    }
    public void showInsertPin(){
        System.out.print("Please enter your PIN: ");
    }

    public void showActions(){
        System.out.println("1 - View Balance");
        System.out.println("2 - Deposit");
        System.out.println("3 - Withdrawal");
        System.out.println("4 - Exit");
        System.out.print("Select an action: ");
    }

    public void showBalance(int sum){
        System.out.println("Your money: " + sum);
    }

    public void showWithdrawalAmounts(){
        System.out.println("1 - 20$");
        System.out.println("2 - 40$");
        System.out.println("3 - 60$");
        System.out.println("4 - 100$");
        System.out.println("5 - 200$");
        System.out.println("6 - Cancel");
        System.out.print("Select amount: ");
    }

    public void showDepositScreen(){
        System.out.print("Enter the amount you want to deposit: ");
    }

    public void showNotEnoughMoneyInAtm(){
        System.out.println("Not enough money in ATM!");
    }
    public void showMessage(String msg){
        System.out.println(msg);
    }
}
