/**
 * Created by ionutmihailescu on 3/16/17.
 */
public class Screen {

    void welcome() {
        System.out.print("Welcome!Please authentificate!\nAccount Number:");
    }

    void transactions(){
        System.out.println("1.Balance\n2.Cash Deposit\n3.Cash withdrawal\n4.Exit");
    }

    void goodbye(){

        System.out.println("Goodbye!");
    }

    void deposit(){
        System.out.print("Enter the amount: ");
    }

    void withdrawal(){
        System.out.print("Enter the amount: ");
    }

    void  error(){
        System.out.println("Not enough money in balance or dispencer!");
    }

    public void withdrawalOptions() {
        System.out.println("1.20$\n2.40$\n3.60$\n4.100%\n5.200$");
    }

    public void balance(int balance) {
        System.out.println("Your balance is: "+balance);
    }
}
