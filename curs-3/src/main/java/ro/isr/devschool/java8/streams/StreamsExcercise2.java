package ro.isr.devschool.java8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by eduard-gabrielmanda on 04/04/17.
 */
public class StreamsExcercise2 {

    public static void main(String[] args) {
        //get the oldest person from the collection
        List<Person> persons = Arrays.asList(
                new Person(25, "Alex"),
                new Person(18, "Catalin"),
                new Person(30, "Alin"),
                new Person(17, "Vali"),
                new Person(35, "Alma"),
                new Person(15, "Sebastian"),
                new Person(35, "Ionut")
        );

        Person oldestPerson = persons.stream().max(Comparator.comparing( e -> e.getAge()) ).get();
        System.out.println("Oldest Person: " + oldestPerson);

        List<Person> oldestPersons = persons.stream()
                .filter( p -> p.getAge() == persons.stream().map(a -> a.getAge()).max(Comparator.naturalOrder()).get() )
                .collect(Collectors.toList());

        oldestPersons.forEach(System.out::println);
    }

}
