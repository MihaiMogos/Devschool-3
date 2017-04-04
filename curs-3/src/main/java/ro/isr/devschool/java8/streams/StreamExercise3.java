package ro.isr.devschool.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExercise3 {

    public static void main(String[] args) {
        // people names separated by coma
        List<Person> persons = Arrays.asList(
                new Person(25, "Alex"),
                new Person(18, "Catalin"),
                new Person(31, "Gabi"),
                new Person(30, "Vali"),
                new Person(35, "Sebastian"),
                new Person(35, "Ionut")
        );

        String peopleNames = persons.stream()
                .map(Person::getName)
                .collect(Collectors.joining(",","Names: ", "."));

        System.out.println(peopleNames);

    }

}
