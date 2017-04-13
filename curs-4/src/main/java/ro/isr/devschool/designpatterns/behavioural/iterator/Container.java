package ro.isr.devschool.designpatterns.behavioural.iterator;

/**
 * Created by Mucefix on 13/04/17.
 */
public interface Container<T> {
    public Iterator<T> getIterator();
}
