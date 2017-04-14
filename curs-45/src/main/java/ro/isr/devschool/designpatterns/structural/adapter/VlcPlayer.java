package ro.isr.devschool.designpatterns.structural.adapter;

/**
 * Created by scipianus on 13-Apr-17.
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing VLC file " + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
