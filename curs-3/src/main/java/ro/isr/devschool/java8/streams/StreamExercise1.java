package ro.isr.devschool.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExercise1 {

    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "My", "Name", "is", "John", "Doe"
        );

        // only the elements with less than 4 chars
        List<String> namesWithLessThan4 = names.stream().filter(s -> s.length() < 4).collect(Collectors.toList());
    }
}
