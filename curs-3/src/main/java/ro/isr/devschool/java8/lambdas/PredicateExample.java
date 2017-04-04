package ro.isr.devschool.java8.lambdas;

import java.util.function.Predicate;

/**
 * Created by eduard-gabrielmanda on 04/04/17.
 */
public class PredicateExample {

    public static void main(String[] args) {

        Predicate<String> predicateString = s -> s.length() < 20;
        Predicate<String> predicateForAnotherString = s -> s.length() > 10;

        //Predicate chain
        Predicate<String> predicateWithTwoConditions = predicateString.and(predicateForAnotherString);

    }

}
