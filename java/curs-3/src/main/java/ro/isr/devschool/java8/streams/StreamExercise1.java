package ro.isr.devschool.java8.streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Andrei on 04.04.2017.
 */
public class StreamExercise1 {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("my","Name","is","John","Doe");

        List<String> namesLessThan4=names.stream().filter(s -> s.length()<4).collect(Collectors.toList());
        namesLessThan4.forEach(System.out::println);
    }
}
