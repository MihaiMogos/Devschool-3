package ro.isr.devschool.designpatterns.structural.adapter;

/**
 * Created by lav on 4/13/2017.
 */
public class Adapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    public Adapter(String audioType) {
        if("vlc".equalsIgnoreCase(audioType)) {
            advancedMediaPlayer = new VlcPlayer();
        } else if("mp4".equalsIgnoreCase(audioType)) {
            advancedMediaPlayer = new MP4Player();
        }
    }

    @Override
    public void play(String audioType, String filename) {
        if("vlc".equalsIgnoreCase(audioType)) {
            advancedMediaPlayer.playVLC(filename);
        } else if("mp4".equalsIgnoreCase(audioType)) {
            advancedMediaPlayer.playMP4(filename);
        }
    }

    /**
     * Created by lav on 4/13/2017.
     */
    public static class AdapterPatternDemo {

        public static void main(String[] args) {
            AudioPlayer audioPlayer = new AudioPlayer();
            audioPlayer.play("mp3", "Beyond the orizon.mp3");
            audioPlayer.play("mp4", "Alone.mp4");
            audioPlayer.play("vlc", "Far far away.vlc");
            audioPlayer.play("avi", "Mind me.vlc");
        }
    }
}
