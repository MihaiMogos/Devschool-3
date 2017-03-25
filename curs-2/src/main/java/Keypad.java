import java.util.Scanner;

/**
 * Created by ionutmihailescu on 3/16/17.
 */
public class Keypad {


    int readOption(){
        Scanner scanner=new Scanner(System.in);
        int option=scanner.nextInt();
        return  option;
    }

}
