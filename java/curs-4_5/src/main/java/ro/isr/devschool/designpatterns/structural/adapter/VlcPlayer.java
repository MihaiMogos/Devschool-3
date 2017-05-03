package ro.isr.devschool.designpatterns.structural.adapter;

/**
 * Created by Andrei on 13.04.2017.
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("playing vlc file. name: "+fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
