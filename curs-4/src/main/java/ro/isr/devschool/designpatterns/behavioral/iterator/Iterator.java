package ro.isr.devschool.designpatterns.behavioral.iterator;


public interface Iterator<T> {
    public boolean hasNext();
    public T next();
}
