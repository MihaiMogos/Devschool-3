package ro.isr.devschool.designpatterns.structural.adapter;

/**
 * Created by lav on 4/13/2017.
 */
public class MP4Player implements AdvancedMediaPlayer {
    @Override
    public void playVLC(String filename) { }

    @Override
    public void playMP4(String filename) {
        System.out.println("Playing MP4 file. Name: " + filename);
    }
}
