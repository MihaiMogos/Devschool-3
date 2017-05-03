package ro.isr.devschool.designpatterns.behavioral.template;

/**
 * Created by Andrei on 13.04.2017.
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game game=new Cricket();
        game.play();
        System.out.println("another game ");
        game=new Football();
        game.play();
    }
}
