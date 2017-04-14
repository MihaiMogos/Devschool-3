package ro.isr.devschool.designpatterns.structural.adapter;

/**
 * Created by lav on 4/13/2017.
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVLC(String filename) {
        System.out.println("Playing VLC file. Name: " + filename);
    }

    @Override
    public void playMP4(String filename) { }
}
