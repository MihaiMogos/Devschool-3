package ro.isr.devschool.designpatterns.behavioral.template.games;

/**
 * Created by scipianus on 13-Apr-17.
 */
public abstract class Game {
    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();

    public final void play() {
        initialize();
        startPlay();
        endPlay();
    }
}
