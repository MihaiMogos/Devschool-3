package ro.isr.devschool.designpatterns.structural.decorator;

import ro.isr.devschool.designpatterns.creational.prototype.*;

/**
 * Created by Andrei on 13.04.2017.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("drawing a rectangle");
    }
}
