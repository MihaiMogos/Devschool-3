package ro.isr.devschool.designpatterns.structural.decorator.decorators;

import ro.isr.devschool.designpatterns.structural.decorator.shapes.Shape;

/**
 * Created by scipianus on 13-Apr-17.
 */
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border set to red");
    }
}
