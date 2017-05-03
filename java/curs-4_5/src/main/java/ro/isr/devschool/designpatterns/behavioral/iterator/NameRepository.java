package ro.isr.devschool.designpatterns.behavioral.iterator;

/**
 * Created by Andrei on 13.04.2017.
 */
public class NameRepository  implements Container{

    public String names[]={"robert","john","vasilica"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    public class NameIterator implements Iterator{
        int index;

        @Override
        public boolean hasNext() {
            if(index<names.length){
                return true;
            }
            else {
                return false;
            }
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return  names[index++];
            }
            return null;
        }
    }
}
