package ro.isr.devschool.designpatterns.structural.adapter;

/**
 * Created by scipianus on 13-Apr-17.
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing MP4 file " + fileName);
    }
}
