package ro.isr.devschool.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamsExample {
    public static void main(String[] args) {


        List<Person> persons= Arrays.asList(
                new Person(26,"alex"),  new Person(18,"catalin"), new Person(30,"alin"),
                new Person(20,"alma"), new Person(15,"sebastian"),  new Person(35,"ionut")
        );

        int sumOfAge=0;
        int numberOfPersons=0;
        for(Person person:persons){
            if(person.getAge()>20){
                numberOfPersons++;
                sumOfAge+=person.getAge();
            }
        }
        double averageAge=(double)sumOfAge/numberOfPersons;
        System.out.println("averageAge "+averageAge);




        Stream<Person> personStream=persons.stream();
        OptionalDouble averageOptional=personStream.mapToInt(person -> person.getAge()).filter(age->age>20).average();
        if (averageOptional.isPresent()){
            System.out.println("cu stream "+averageOptional.getAsDouble() );
        }

        List<Person> personsAbove20=persons.stream().filter(person -> person.getAge()>20).collect(Collectors.toList());
        personsAbove20.forEach(System.out::println);


    }


}
