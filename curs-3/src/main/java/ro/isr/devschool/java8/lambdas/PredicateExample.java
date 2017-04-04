package ro.isr.devschool.java8.lambdas;

import java.util.function.Predicate;

/**
 * Created by scipianus on 04-Apr-17.
 */
public class PredicateExample {
    public static void main(String[] args) {
        Predicate<String> predicate1 = s -> s.length() < 20;
        Predicate<String> predicate2 = s -> s.length() > 10;

        // Predicate chain
        Predicate<String> predicateChain = predicate1.and(predicate2);
    }
}
