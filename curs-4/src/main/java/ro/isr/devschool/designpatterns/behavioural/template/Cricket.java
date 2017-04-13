package ro.isr.devschool.designpatterns.behavioural.template;

/**
 * Created by Mucefix on 13/04/17.
 */
public class Cricket extends Game {
    @Override
    void initialize() {
        System.out.println("Initializing Cricket Game");
    }
    @Override
    void startPlay() {
        System.out.println("Cricket Game started");
    }
    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished");
    }
}
