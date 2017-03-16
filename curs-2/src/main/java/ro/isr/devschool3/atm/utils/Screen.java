package ro.isr.devschool3.atm.utils;

/**
 * Created by scipianus on 16-Mar-17.
 */
public class Screen {

    public void display(String message) {
        System.out.println(message);
    }

    public void displayFormatted(String message, Object param) {
        System.out.printf(message, param);
    }
}
