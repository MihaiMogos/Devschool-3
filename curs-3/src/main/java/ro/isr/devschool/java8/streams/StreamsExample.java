package ro.isr.devschool.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Mucefix on 04/04/17.
 */
public class StreamsExample {

    public static void main(String[] args) {
        //the average of the age of the people older than 20
        List<Person> persons = Arrays.asList(
                new Person(25, "Alex"),
                new Person(18, "Catalin"),
                new Person(30, "Alin"),
                new Person(17, "Vali"),
                new Person(28, "Alma"),
                new Person(15, "Sebastian"),
                new Person(35, "Ionut")
        );

        int sumOfAge = 0;
        int numberOfPersons = 0;
        for( Person person: persons ){
            if( person.getAge() > 20 ){
                numberOfPersons++;
                sumOfAge += person.getAge();
            }
        }

        double averageAge= (double)sumOfAge/numberOfPersons;
        System.out.println("Media varstei este: "+ averageAge);

        Stream<Person> personStream = persons.stream();
        OptionalDouble averageOptional =  personStream.mapToInt(person -> person.getAge()).filter(age -> age > 20).average();
        if( averageOptional.isPresent() ){
            System.out.println("Media varstei cu streams: "+ averageOptional.getAsDouble());
        }

        //persoanele peste 20 de ani
        List<Person> personsAbove20 =  persons.stream().filter(p -> p.getAge() > 20).collect(Collectors.toList());
        personsAbove20.forEach(System.out::println);

    }
}
