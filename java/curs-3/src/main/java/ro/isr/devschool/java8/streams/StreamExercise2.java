package ro.isr.devschool.java8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class StreamExercise2 {
    public static void main(String[] args) {
        List<Person> persons= Arrays.asList(
                new Person(26,"alex"),  new Person(18,"catalin"), new Person(30,"alin"),
                new Person(35,"alma"), new Person(15,"sebastian"),  new Person(35,"ionut")
        );

        Person oldestPerson=persons.stream().max(Comparator.comparing(e-> e.getAge())).get();
        System.out.println("oldestPerson "+oldestPerson);

        List<Person> oldestPersons=persons.stream().filter(p-> p.getAge()==persons.stream().map(a->a.getAge()).max(Comparator.naturalOrder()).get() )
                .collect(Collectors.toList());
        oldestPersons.forEach(System.out::println);




    }
}
