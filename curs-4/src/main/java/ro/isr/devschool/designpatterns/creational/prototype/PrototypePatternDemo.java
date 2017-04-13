package ro.isr.devschool.designpatterns.creational.prototype;

/**
 * Created by crist on 06-Apr-17.
 */
public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = ShapeCache.getShape("1");
        System.out.println("Shape: " + clonedShape.getType());
    }
}
