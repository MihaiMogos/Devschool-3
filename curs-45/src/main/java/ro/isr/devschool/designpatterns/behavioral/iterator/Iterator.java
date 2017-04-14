package ro.isr.devschool.designpatterns.behavioral.iterator;

/**
 * Created by scipianus on 13-Apr-17.
 */
public interface Iterator<T> {
    boolean hasNext();

    T next();
}
