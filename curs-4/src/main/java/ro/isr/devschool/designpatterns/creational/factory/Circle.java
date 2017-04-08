package ro.isr.devschool.designpatterns.creational.factory;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}
