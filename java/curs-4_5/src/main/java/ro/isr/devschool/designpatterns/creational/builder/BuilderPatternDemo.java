package ro.isr.devschool.designpatterns.creational.builder;

/**
 * Created by Andrei on 06.04.2017.
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        Student myStudent=Student.builder()
                                .cnp("123123213213123123")
                                .nume("radu")
                                .varsta(12)
                                .build();
        System.out.println(myStudent);
    }
}
