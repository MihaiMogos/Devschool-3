package ro.isr.devschool.atm;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Scanner;

/**
 * Created by eduard-gabrielmanda on 16/03/17.
 */
@NoArgsConstructor
@Getter @Setter
public class Keypad {

    Scanner scanner = new Scanner(System.in);

    public int getKey() {
        return scanner.nextInt();
    }


}
