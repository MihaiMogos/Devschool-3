import lombok.Getter;

import java.util.Scanner;

/**
 * Created by Viorica Patrascu on 3/16/2017.
 */
public class Keypad {

    private Scanner scanner;

    public Keypad() {
        scanner = new Scanner(System.in);
    }

    public int readUserInput() {
        int userInput = scanner.nextInt();
        return userInput;
    }
}
