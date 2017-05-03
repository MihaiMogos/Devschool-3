package ro.isr.devschool.designpatterns.structural.adapter;

/**
 * Created by Andrei on 13.04.2017.
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer=new AudioPlayer();
        audioPlayer.play("mp3","beyond the horizon.mp3");
        audioPlayer.play("mp4","sadasdsadsdas.mp4");
        audioPlayer.play("vlc","alone.vlc");
        audioPlayer.play("avi","alone.avi");
    }
}
