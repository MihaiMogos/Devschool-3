package ro.isr.devschool.java8.lambdas;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by eduard-gabrielmanda on 04/04/17.
 */
public class ConsumerExample {


    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Ionut");
        names.add("Ciprian");
        names.add("Lavinia");
        names.add("Mihaela");
        //use a lambda
        names.forEach(name -> System.out.println(name));
        //use method reference instead of lambda
        names.forEach(System.out::println);
    }


}
