package ro.isr.devschool.designpatterns.behavioural.observer;

/**
 * Created by Mucefix on 13/04/17.
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: "+ Integer.toOctalString(subject.getStatte()));
    }
}