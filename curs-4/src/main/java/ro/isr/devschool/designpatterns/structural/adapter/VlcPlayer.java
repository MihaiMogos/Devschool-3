package ro.isr.devschool.designpatterns.structural.adapter;

/**
 * Created by Mucefix on 13/04/17.
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String filename) {
        System.out.println("Playing vlc file. Name: "+filename);
    }

    @Override
    public void playMp4(String filename) {
    }
}
