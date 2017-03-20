package ro.isr.devschool.poo.chess.tema;


public class Display {

    public void displayMessage(String message) {
        System.out.println(message);
    }
    public void displayMainMenu(){
        System.out.println("\nMenu:");
        System.out.println("1. View my balance");
        System.out.println("2. Deposit:");
        System.out.println("3. Withdrawal:");
        System.out.println("4. Exit:");
        System.out.println("5. Stop");
        System.out.println("choose a number between 1,2,3,4,5");

    }

    public void displayWithdrawalMenu(){
        System.out.println("\nChoose the amount you want to withdraw:");
        System.out.println("1. 20 ");
        System.out.println("2. 40");
        System.out.println("3. 60");
        System.out.println("4. 100");
        System.out.println("5. 200");
        System.out.println("6. Back");
        System.out.println("choose a number between 1,2,3,4,4,5,6");

    }
}
