package ro.isr.devschool.designpatterns.creational.prototype.shapes;

import lombok.Getter;
import lombok.Setter;
import ro.isr.devschool.designpatterns.creational.factory.shapes.ShapeType;

/**
 * Created by scipianus on 06-Apr-17.
 */
public abstract class Shape implements Cloneable {
    @Getter
    @Setter
    private String id;
    @Getter
    protected ShapeType type;

    public abstract void draw();

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
