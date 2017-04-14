package ro.isr.devschool.designpatterns.behavioral.iterator;

/**
 * Created by lav on 4/13/2017.
 */
public interface Container<T> {
    public Iterator<T> getIterator();
}
