package ro.isr.devschool.designpatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mucefix on 06/04/17.
 */
public class ShapeCache {

    private static Map<String, Shape> shapeMap = new HashMap<>();

    public static Shape getShape(String shapeId){
        //we do not want to return the object existing in the cache, because that has
        //a state that we do not want to change. Instead we deliver a "similar" one
        //by cloning something from the cache
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    public static void loadCache(){
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }

}
