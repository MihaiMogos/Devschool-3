package ro.isr.devschool.designpatterns.behavioral.template;

/**
 * Created by Andrei on 13.04.2017.
 */
public abstract class Game {

    abstract void inialize();
    abstract void startPlay();
    abstract void endPlay();

    public final void play(){
        inialize();
        startPlay();
        endPlay();
    }
}
