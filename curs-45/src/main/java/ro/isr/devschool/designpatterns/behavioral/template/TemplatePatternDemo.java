package ro.isr.devschool.designpatterns.behavioral.template;

import ro.isr.devschool.designpatterns.behavioral.template.games.Cricket;
import ro.isr.devschool.designpatterns.behavioral.template.games.Football;
import ro.isr.devschool.designpatterns.behavioral.template.games.Game;

/**
 * Created by scipianus on 13-Apr-17.
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game[] games = {new Cricket(), new Football()};
        for (Game game : games) {
            game.play();
        }
    }
}
