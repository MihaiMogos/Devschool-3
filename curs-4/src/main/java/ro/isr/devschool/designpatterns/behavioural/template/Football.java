package ro.isr.devschool.designpatterns.behavioural.template;

/**
 * Created by Mucefix on 13/04/17.
 */
public class Football extends Game {
    @Override
    void initialize() {
        System.out.println("Initializing Football Game");
    }
    @Override
    void startPlay() {
        System.out.println("Football Game started");
    }
    @Override
    void endPlay() {
        System.out.println("Football Game Finished");
    }
}
