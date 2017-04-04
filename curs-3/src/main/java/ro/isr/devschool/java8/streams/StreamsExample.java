package ro.isr.devschool.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by scipianus on 04-Apr-17.
 */
public class StreamsExample {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person(25, "Alex"),
                new Person(18, "Catalin"),
                new Person(30, "Alin"),
                new Person(17, "Vali"),
                new Person(28, "Alma"),
                new Person(15, "Sebastian"),
                new Person(35, "Ionut")
        );

        // the average age of the people older than 20

        // the old way
        int sumOfAge = 0;
        int numberOfPersons = 0;
        for (Person person : persons) {
            if (person.getAge() > 20) {
                sumOfAge += person.getAge();
                numberOfPersons++;
            }
        }
        double averageAge = (double) sumOfAge / numberOfPersons;
        System.out.println("Media varstei este: " + averageAge);

        // using streams
        Stream<Person> personStream = persons.stream();
        OptionalDouble averageAgeOptional = personStream.mapToInt(person -> person.getAge()).filter(age -> age > 20).average();
        if (averageAgeOptional.isPresent()) {
            System.out.println("Media varstei este: " + averageAgeOptional.getAsDouble());
        }

        // persons over 20 years
        personStream = persons.stream();
        List<Person> personsOver20 = personStream.filter(person -> person.getAge() > 20).collect(Collectors.toList());
        System.out.println("Persons over 20 years:");
        personsOver20.forEach(person -> System.out.println(person));
    }
}
