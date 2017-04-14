package ro.isr.devschool.designpatterns.behavioral.template;

/**
 * Created by lav on 4/13/2017.
 */
public class Football extends Game {
    @Override
    void initializeGame() {
        System.out.println("[Football] init Game");
    }

    @Override
    void startPlay() {
        System.out.println("[Football] start Game");
    }

    @Override
    void endPlay() {
        System.out.println("[Football] end Game");
    }
}
