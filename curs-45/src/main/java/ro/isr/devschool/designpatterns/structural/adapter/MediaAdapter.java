package ro.isr.devschool.designpatterns.structural.adapter;

/**
 * Created by scipianus on 13-Apr-17.
 */
public class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if ("vlc".equals(audioType)) {
            advancedMediaPlayer = new VlcPlayer();
        } else if ("mp4".equals(audioType)) {
            advancedMediaPlayer = new Mp4Player();
        } else {
            throw new RuntimeException("Unknown audio type");
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if ("vlc".equals(audioType)) {
            advancedMediaPlayer.playVlc(fileName);
        } else if ("mp4".equals(audioType)) {
            advancedMediaPlayer.playMp4(fileName);
        } else {
            throw new RuntimeException("Unknown audio type");
        }
    }
}
