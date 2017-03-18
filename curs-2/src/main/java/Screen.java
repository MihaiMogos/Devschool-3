import lombok.Getter;

import java.util.Scanner;

/**
 * Created by Viorica Patrascu on 3/16/2017.
 */
public class Screen {

    public void displayMessage(String messageToDisplay) {
        System.out.println(messageToDisplay);
    }

    public void displayATMOptions() {
        System.out.println("Which action do you want to perform?");
        System.out.println("1. View my balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    public void displayWithdrawOptions() {
        System.out.println("1. 20$");
        System.out.println("2. 40$");
        System.out.println("3. 60$");
        System.out.println("4. 100$");
        System.out.println("5. 200$");
    }

    public void displayYesNo() {
        System.out.println("1. yes");
        System.out.println("2. no");
    }
}
