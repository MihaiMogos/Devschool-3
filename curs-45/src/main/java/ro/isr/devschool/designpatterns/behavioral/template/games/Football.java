package ro.isr.devschool.designpatterns.behavioral.template.games;

/**
 * Created by scipianus on 13-Apr-17.
 */
public class Football extends Game {
    @Override
    void initialize() {
        System.out.println("Initializing Football Game");
    }

    @Override
    void startPlay() {
        System.out.println("Starting Football Game");
    }

    @Override
    void endPlay() {
        System.out.println("Finishing Football Game");
    }
}
