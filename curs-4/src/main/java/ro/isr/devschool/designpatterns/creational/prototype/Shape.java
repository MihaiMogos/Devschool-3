package ro.isr.devschool.designpatterns.creational.prototype;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by eduard-gabrielmanda on 06/04/17.
 */
//the prototype MUST implement Cloneable
public abstract class Shape implements Cloneable {

    @Getter @Setter
    private String id;
    @Getter
    protected String type;

    abstract void draw();

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
