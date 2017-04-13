package ro.isr.devschool.java8.lambdas;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by crist on 04-Apr-17.
 */
public class ConsumerExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ionut");
        names.add("Ceva");
        names.add("Ion");
        names.add("Bla");
        // use a lambda
        names.forEach(name -> System.out.println(name));

        // use method reference instead of lambda
        names.forEach(System.out::println);


    }
}
