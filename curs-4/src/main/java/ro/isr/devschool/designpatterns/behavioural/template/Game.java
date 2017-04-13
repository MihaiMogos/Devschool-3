package ro.isr.devschool.designpatterns.behavioural.template;

/**
 * Created by Mucefix on 13/04/17.
 */
public abstract class Game {

    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    public final void play(){
        initialize();
        startPlay();
        endPlay();
    }

}
