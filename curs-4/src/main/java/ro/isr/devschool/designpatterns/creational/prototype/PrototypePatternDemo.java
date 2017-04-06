package ro.isr.devschool.designpatterns.creational.prototype;

/**
 * Created by eduard-gabrielmanda on 06/04/17.
 */
public class PrototypePatternDemo {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = ShapeCache.getShape("3");
        System.out.println("Shape: " + clonedShape.getType());
    }
}
