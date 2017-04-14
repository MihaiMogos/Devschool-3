package ro.isr.devschool.designpatterns.structural.adapter;

/**
 * Created by scipianus on 13-Apr-17.
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        try {
            audioPlayer.play("mp3", "A.mp3");
            audioPlayer.play("vlc", "B.vlc");
            audioPlayer.play("mp4", "C.mp4");
            audioPlayer.play("avi", "D.avi");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
