package ro.isr.devschool.designpatterns.creational.prototype;

public class PrototypeDemo {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = ShapeCache.getShape("1");
        System.out.println("Shape " + clonedShape.getType());
    }
}
