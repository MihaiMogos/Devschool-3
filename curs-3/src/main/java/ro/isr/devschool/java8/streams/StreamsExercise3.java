package ro.isr.devschool.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Mucefix on 04/04/17.
 */
public class StreamsExercise3 {

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

        //people names separated by coma
        String namesConcatenated = persons.stream()
                                    .map(Person::getName)
                                    .collect(Collectors.joining(",","Names: ","."));
        System.out.println(namesConcatenated);

    }

}
