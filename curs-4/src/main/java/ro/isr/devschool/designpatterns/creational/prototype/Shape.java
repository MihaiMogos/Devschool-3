package ro.isr.devschool.designpatterns.creational.prototype;

import lombok.Getter;
import lombok.Setter;

// the prototype must implement Clonable
public abstract class Shape implements Cloneable {

    @Getter @Setter
    private String id;
    @Getter
    protected String type;

    abstract void draw();

    public Object clone() {
        Object object = null;

        try{
            object = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return object;
    }

}
