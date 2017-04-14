package ro.isr.devschool.designpatterns.behavioral.iterator;

/**
 * Created by lav on 4/13/2017.
 */
public class IteratorPattenDemo {

    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();

        for (Iterator it = nameRepository.getIterator(); it.hasNext() ; ) {
            String name = (String) it.next();
            System.out.println("Name " + name);
        }
    }
}
