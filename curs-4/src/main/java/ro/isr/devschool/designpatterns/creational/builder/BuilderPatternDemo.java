package ro.isr.devschool.designpatterns.creational.builder;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        Student myStudent = Student.builder()
                                .cnp("1603425456545")
                                .nume("Radu")
                                .varsta(12)
                                .build();
        System.out.println(myStudent);
    }
}
