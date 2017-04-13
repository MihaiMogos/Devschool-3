package ro.isr.devschool.designpatterns.structural.adapter;

/**
 * Created by Mucefix on 13/04/17.
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String filename) {
    }

    @Override
    public void playMp4(String filename) {
        System.out.println("Playing mp4 file. Name: "+ filename);
    }
}
