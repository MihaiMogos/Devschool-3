package ro.isr.devschool.java8.streams;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {
        // the average of the age of the people older than 20
        List<Person> persons = Arrays.asList(
                new Person(25, "Alex"),
                new Person(18, "Catalin"),
                new Person(31, "Gabi"),
                new Person(30, "Vali"),
                new Person(17, "Sebastian"),
                new Person(35, "Ionut")
        );

        int sumOfAge = 0;
        int numerOfPersons = 0;

        for (Person person : persons){
            if(person.getAge() > 20) {
                sumOfAge += person.getAge();
                numerOfPersons++;
            }
        }
        double average = (double) sumOfAge / numerOfPersons;
        System.out.println("Media " + average);

        Stream<Person> personStream = persons.stream();
        OptionalDouble averageOptional = personStream.mapToInt(person -> person.getAge()).filter(age -> age > 20).average();
        if(averageOptional.isPresent())
            System.out.println("Streams = " + averageOptional.getAsDouble());

        List<Person> personAbove20 = persons.stream().filter(person -> person.getAge()> 20).collect(Collectors.toList());
        personAbove20.forEach(System.out::println);
    }
}
