package ro.isr.devschool.designpatterns.behavioral.template;

/**
 * Created by Andrei on 13.04.2017.
 */
public class Football extends Game {
    @Override
    void inialize() {
        System.out.println("initializing Football game");
    }

    @Override
    void startPlay() {
        System.out.println(" Football started");

    }

    @Override
    void endPlay() {
        System.out.println("Football game finished");

    }
}
