package ro.isr.devschool.designpatterns.structural.adapter;

/**
 * Created by Andrei on 13.04.2017.
 */
public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType){
        if("vlc".equalsIgnoreCase(audioType)){
            advancedMediaPlayer=new VlcPlayer();
        }
        else if("mp4".equalsIgnoreCase(audioType)){
            advancedMediaPlayer=new Mp4Player();
        }
    }

    @Override
    public void play(String autdioType, String fileName) {
        if("vlc".equalsIgnoreCase(autdioType)){
            advancedMediaPlayer.playVlc(fileName);
        } else if("mp4".equalsIgnoreCase(autdioType)){
            advancedMediaPlayer.playMp4(fileName);
        }

    }
}
