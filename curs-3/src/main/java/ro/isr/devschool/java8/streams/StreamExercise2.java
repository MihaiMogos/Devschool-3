package ro.isr.devschool.java8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by crist on 04-Apr-17.
 */
public class StreamExercise2 {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person(25, "Alex"),
                new Person(18, "Catalin"),
                new Person(30, "Alin"),
                new Person(35, "Vali"),
                new Person(28, "Alma"),
                new Person(15, "Sebastian"),
                new Person(35, "Ionut")
        );
        // get the oldest person from the collection
        Person oldestPerson = persons.stream().max(Comparator.comparing(e -> e.getAge())).get();
        System.out.println(oldestPerson);

        List<Person> oldestPersons = persons.stream().filter(p -> p.getAge() == persons.stream()
                                    .map(age -> age.getAge()).max(Comparator.naturalOrder()).get())
                                    .collect(Collectors.toList());
        oldestPersons.forEach(System.out::println);
    }
}
