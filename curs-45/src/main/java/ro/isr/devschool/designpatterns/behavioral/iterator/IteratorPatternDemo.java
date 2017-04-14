package ro.isr.devschool.designpatterns.behavioral.iterator;

/**
 * Created by scipianus on 13-Apr-17.
 */
public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();
        for (Iterator<String> it = nameRepository.getIterator(); it.hasNext(); ) {
            System.out.println(it.next());
        }
    }
}
