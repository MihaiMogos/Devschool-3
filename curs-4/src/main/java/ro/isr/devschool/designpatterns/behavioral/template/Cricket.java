package ro.isr.devschool.designpatterns.behavioral.template;

/**
 * Created by lav on 4/13/2017.
 */
public class Cricket extends Game {
    @Override
    void initializeGame() {
        System.out.println("[Cricket] init Game");
    }

    @Override
    void startPlay() {
        System.out.println("[Cricket] start Game");
    }

    @Override
    void endPlay() {
        System.out.println("[Cricket] end Game");
    }
}
