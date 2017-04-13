package ro.isr.devschool.designpatterns.behavioural.template;

/**
 * Created by Mucefix on 13/04/17.
 */
public class TemplatePatternDemo {

    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println("Another game");
        game = new Football();
        game.play();
    }
}
