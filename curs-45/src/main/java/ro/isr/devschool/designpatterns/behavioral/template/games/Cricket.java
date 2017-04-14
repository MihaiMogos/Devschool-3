package ro.isr.devschool.designpatterns.behavioral.template.games;

/**
 * Created by scipianus on 13-Apr-17.
 */
public class Cricket extends Game {
    @Override
    void initialize() {
        System.out.println("Initializing Cricket Game");
    }

    @Override
    void startPlay() {
        System.out.println("Starting Cricket Game");
    }

    @Override
    void endPlay() {
        System.out.println("Finishing Cricket Game");
    }
}
