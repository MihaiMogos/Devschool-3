package ro.isr.devschool.designpatterns.structural.decorator;

public class DecoratorPatternDemo {

    public static void main(String[] args) {
        Shape circle = new Circle();
        System.out.println("Drawing normal circle");
        circle.draw();

        System.out.println("Drawing decorated circle");
        circle = new RedShapeDecorator(new Circle());
        circle.draw();
    }
}
