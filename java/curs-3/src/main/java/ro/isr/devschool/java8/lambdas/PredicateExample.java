package ro.isr.devschool.java8.lambdas;

import java.util.function.Predicate;

/**
 * Created by Andrei on 04.04.2017.
 */
public class PredicateExample {
    public static void main(String[] args) {
        Predicate<String> predicteString=s-> s.length()<20;
        Predicate<String> predicateForAnotherString=s->s.length()>10;

        Predicate<String> predicateWithTwhoConditions=predicteString.and(predicateForAnotherString);

    }
}
