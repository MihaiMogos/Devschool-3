package ro.isr.devschool.designpatterns.behavioral.template;

/**
 * Created by Andrei on 13.04.2017.
 */
public class Cricket extends Game {
    @Override
    void inialize() {
        System.out.println("initializing cricket game");
    }

    @Override
    void startPlay() {
        System.out.println("cricket game started");

    }

    @Override
    void endPlay() {
        System.out.println("cricket game finished");

    }
}
