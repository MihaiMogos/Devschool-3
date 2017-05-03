package ro.isr.devschool.designpatterns.structural.decorator;

/**
 * Created by Andrei on 13.04.2017.
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape ){
        this.decoratedShape=decoratedShape;
    }
    public void draw(){
        decoratedShape.draw();
    }

}
