package ro.isr.devschool.designpatterns.structural.adapter;

/**
 * Created by scipianus on 13-Apr-17.
 */
public class AudioPlayer implements MediaPlayer {
    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if ("mp3".equals(audioType)) {
            System.out.println("Playing MP3 file " + fileName);
        } else if ("vlc".equals(audioType) || "mp4".equals(audioType)) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            throw new RuntimeException("Unknown audio type");
        }
    }
}
