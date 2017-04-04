package ro.isr.devschool.java8.lambdas;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by scipianus on 04-Apr-17.
 */
public class ConsumerExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ionut");
        names.add("Ciprian");
        names.add("Lavinia");

        // use lambdas
        names.forEach(name -> System.out.println(name));

        // use method reference
        names.forEach(System.out::println);
    }
}
