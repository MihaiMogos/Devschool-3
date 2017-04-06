package ro.isr.devschool.designpatterns.creational.builder;

/**
 * Created by eduard-gabrielmanda on 06/04/17.
 */
public class BuilderPatternDemo {

    public static void main(String[] args) {
        Student myStudent = Student.builder()
                                   .cnp("123")
                                   .nume("Radu")
                                   .varsta(12)
                                   .build();

        System.out.println(myStudent);
    }
}
