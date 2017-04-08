package ro.isr.devschool.designpatterns.creational.factory;

public class ShapeFactory {

    public static Shape getShape(String shapeType) {
        if(shapeType == null)
            return null;
        else if("CIRCLE".equals(shapeType))
            return new Circle();
        else if("SQUARE".equals(shapeType))
            return new Square();
        else if("RECTANGLE".equals(shapeType))
            return new Rectangle();
        return null;
    }
}
