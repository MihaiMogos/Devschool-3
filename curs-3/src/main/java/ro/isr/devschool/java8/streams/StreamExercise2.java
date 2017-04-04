package ro.isr.devschool.java8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by lav on 4/4/2017.
 */
public class StreamExercise2 {

    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person(25, "Alex"),
                new Person(18, "Catalin"),
                new Person(31, "Gabi"),
                new Person(30, "Vali"),
                new Person(35, "Sebastian"),
                new Person(35, "Ionut")
        );

//        Person oldestPerson = persons.stream().max(Comparator.comparing(e -> e.getAge())).get();
//        System.out.println(oldestPerson);

        List<Person> oldestPerson1 = persons.stream()
                .filter(p -> p.getAge() == persons.stream().map(person ->  person.getAge())
                .max(Comparator.naturalOrder()).get())
                .collect(Collectors.toList());

        System.out.println(oldestPerson1);
    }
}
