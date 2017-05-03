package ro.isr.devschool.java8.lambdas;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrei on 04.04.2017.
 */
public class ConsumerExample {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("ionut");
        names.add("vasile");
        names.add("ciprian");
        names.add("mihaela");

        names.forEach(name-> System.out.println(name));

        names.forEach(System.out::println);


    }
}
