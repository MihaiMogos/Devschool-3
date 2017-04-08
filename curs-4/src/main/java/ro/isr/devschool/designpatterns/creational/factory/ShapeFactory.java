package ro.isr.devschool.designpatterns.creational.factory;

/**
 * Created by Mucefix on 06/04/17.
 */
public class ShapeFactory {

    public Shape getShape(String shapeType){
        if( shapeType == null ){
            return null;
        }
        if( "CIRCLE".equalsIgnoreCase(shapeType) ){
            return new Circle();
        }else if("RECTANGLE".equalsIgnoreCase(shapeType)){
            return new Rectangle();
        }else if ("SQUARE".equalsIgnoreCase(shapeType)){
            return new Square();
        }
        return null;
    }
}
