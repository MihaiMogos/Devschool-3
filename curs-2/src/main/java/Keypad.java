import java.util.Scanner;

public class Keypad {
    Scanner scan;

    public Keypad(){
        scan = new Scanner(System.in);
    }

    public int getUserInput(){
        return scan.nextInt();
    }
}
