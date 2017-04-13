package ro.isr.devschool.designpatterns.structural.decorator;

/**
 * Created by Mucefix on 13/04/17.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}
