package ro.isr.devschool.designpatterns.behavioural.iterator;

/**
 * Created by Mucefix on 13/04/17.
 */
public interface Iterator<T> {
    public boolean hasNext();
    public T next();
}
