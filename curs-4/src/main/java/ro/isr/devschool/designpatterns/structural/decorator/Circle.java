package ro.isr.devschool.designpatterns.structural.decorator;

import ro.isr.devschool.designpatterns.creational.factory.*;

/**
 * Created by lav on 4/13/2017.
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle");
    }
}
