package ro.isr.devschool.java8.lambdas;

import java.util.function.Predicate;

/**
 * Created by crist on 04-Apr-17.
 */
public class PredicateExample {
    public static void main(String[] args) {
        Predicate<String> predicateString = s -> s.length() < 20;
        Predicate<String> predicateString2 = s -> s.length() >10;
        //Predicate chain
        Predicate<String> predicateWithTwoConditions = predicateString.and(predicateString2);
    }
}
