package ro.isr.devschool.java8.streams;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by scipianus on 04-Apr-17.
 */
@AllArgsConstructor
@Getter
@Setter
public class Person {
    private int age;
    private String name;

    @Override
    public String toString() {
        return name + " : " + age;
    }
}
