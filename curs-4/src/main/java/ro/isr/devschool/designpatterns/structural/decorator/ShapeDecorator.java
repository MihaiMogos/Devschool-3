package ro.isr.devschool.designpatterns.structural.decorator;

/**
 * Created by Mucefix on 13/04/17.
 */
public abstract class ShapeDecorator implements Shape{
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw(){
        decoratedShape.draw();
    }

}
