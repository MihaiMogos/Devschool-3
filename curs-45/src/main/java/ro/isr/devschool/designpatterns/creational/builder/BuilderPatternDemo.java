package ro.isr.devschool.designpatterns.creational.builder;

/**
 * Created by scipianus on 06-Apr-17.
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        Student myStudent = Student.builder()
                .cnp("1950505370000")
                .prenume("Ciprian")
                .nume("Olariu")
                .varsta(21)
                .build();
        System.out.println(myStudent);
    }
}
