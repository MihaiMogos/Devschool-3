package ro.isr.devschool.java8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by scipianus on 04-Apr-17.
 */
public class StreamsExercise2 {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person(25, "Alex"),
                new Person(18, "Catalin"),
                new Person(30, "Alin"),
                new Person(17, "Vali"),
                new Person(35, "Alma"),
                new Person(15, "Sebastian"),
                new Person(35, "Ionut")
        );

        // get the oldest person from the collection
        System.out.println("Oldest person:");
        System.out.println(persons.stream().max(Comparator.comparing(person -> person.getAge())).get());
        System.out.println();

        // get all the oldest persons from the collection
        System.out.println("List of oldest persons:");
        List<Person> oldestPersons = persons.stream()
                .filter(person -> person.getAge() == persons.stream().mapToInt(p -> p.getAge()).max().getAsInt())
                .collect(Collectors.toList());
        oldestPersons.forEach(System.out::println);
    }
}
