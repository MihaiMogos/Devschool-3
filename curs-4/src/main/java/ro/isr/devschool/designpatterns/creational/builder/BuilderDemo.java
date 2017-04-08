package ro.isr.devschool.designpatterns.creational.builder;

public class BuilderDemo {

    public static void main(String[] args) {
        Student myStudent = Student.builder().cnp("094005278694")
                                             .nume("Radu")
                                             .varsta(12)
                                             .build();

        System.out.println(myStudent.toString());
    }
}
