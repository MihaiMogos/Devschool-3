package ro.isr.devschool.designpatterns.structural.adapter;

/**
 * Created by lav on 4/13/2017.
 */
public class AudioPlayer implements MediaPlayer {
    Adapter mediaPlayer;



    @Override
    public void play(String audioType, String filename) {
        if("mp3".equalsIgnoreCase(audioType)){
            System.out.println("Playing mp3 file. Name: " + filename);
        }else if ("vlc".equalsIgnoreCase(audioType) || "mp4".equalsIgnoreCase(audioType)){
            mediaPlayer = new Adapter(audioType);
            mediaPlayer.play(audioType, filename);
        } else {
            System.out.println("Invalid media." + audioType + " not recognized");
        }
    }
}
