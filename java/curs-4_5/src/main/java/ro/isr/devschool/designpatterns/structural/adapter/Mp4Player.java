package ro.isr.devschool.designpatterns.structural.adapter;

/**
 * Created by Andrei on 13.04.2017.
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("playing mp4. name "+ fileName);
    }
}
