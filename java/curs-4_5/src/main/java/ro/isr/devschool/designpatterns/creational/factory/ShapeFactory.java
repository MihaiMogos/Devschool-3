package ro.isr.devschool.designpatterns.creational.factory;

/**
 * Created by Andrei on 06.04.2017.
 */
public class ShapeFactory {
    public Shape getShape(String shapeType){
        if(shapeType==null){
            return null;
        }
        if ("CIRCLE".equalsIgnoreCase(shapeType)) {
            return new Circle();
        }
        else if("RECTANGLE".equalsIgnoreCase(shapeType)){
                return new Rectangle();
            }
            else            return new Square();





    }
}
