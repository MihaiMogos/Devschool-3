package ro.isr.devschool.designpatterns.structural.decorator.decorators;

import lombok.AllArgsConstructor;
import ro.isr.devschool.designpatterns.structural.decorator.shapes.Shape;

/**
 * Created by scipianus on 13-Apr-17.
 */
@AllArgsConstructor
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
