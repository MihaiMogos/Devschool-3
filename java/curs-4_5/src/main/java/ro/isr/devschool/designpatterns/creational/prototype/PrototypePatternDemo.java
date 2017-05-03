package ro.isr.devschool.designpatterns.creational.prototype;

/**
 * Created by Andrei on 06.04.2017.
 */
public class PrototypePatternDemo {

    public static void main(String[] args) {
        ShapeCache.loadCache();
        Shape clonedShape=ShapeCache.getShape("1");
        System.out.println("shape "+clonedShape.getType());
    }
}
