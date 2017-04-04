package ro.isr.devschool3.atm.utils;

import java.util.Scanner;

/**
 * Created by scipianus on 16-Mar-17.
 */
public class KeyPad {
    private Scanner scanner;

    public KeyPad() {
        scanner = new Scanner(System.in);
    }

    public int getNextInput() {
        return scanner.nextInt();
    }
}
