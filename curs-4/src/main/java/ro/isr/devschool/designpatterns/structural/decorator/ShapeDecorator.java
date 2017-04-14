package ro.isr.devschool.designpatterns.structural.decorator;

import ro.isr.devschool.designpatterns.creational.factory.*;

public abstract class ShapeDecorator implements Shape{
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw() {
        decoratedShape.draw();
    }
}
