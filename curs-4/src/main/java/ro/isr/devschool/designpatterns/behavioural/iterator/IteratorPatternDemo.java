package ro.isr.devschool.designpatterns.behavioural.iterator;

/**
 * Created by Mucefix on 13/04/17.
 */
public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();
        for( Iterator<String> it = nameRepository.getIterator(); it.hasNext(); ){
            String name = it.next();
            System.out.println("Name: "+ name);
        }
    }
}
