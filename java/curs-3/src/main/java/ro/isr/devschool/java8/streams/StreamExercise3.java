package ro.isr.devschool.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class StreamExercise3 {
    public static void main(String[] args) {

        List<Person> persons= Arrays.asList(
                new Person(26,"alex"),  new Person(18,"catalin"), new Person(30,"alin"),
                new Person(35,"alma"), new Person(15,"sebastian"),  new Person(35,"ionut")
        );

        //people names separated by comma


        String namesConcatenated=persons.stream().map(Person::getName).collect(Collectors.joining(",","Names:","."));
        System.out.println(namesConcatenated);

    }
}
