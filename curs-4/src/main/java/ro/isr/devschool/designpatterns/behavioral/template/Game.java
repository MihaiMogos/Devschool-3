package ro.isr.devschool.designpatterns.behavioral.template;

public abstract class Game {

    abstract void initializeGame();
    abstract void startPlay();
    abstract void endPlay();

    public final void play() {
        initializeGame();
        startPlay();
        endPlay();
    }
}
