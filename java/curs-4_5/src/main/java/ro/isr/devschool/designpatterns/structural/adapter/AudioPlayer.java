package ro.isr.devschool.designpatterns.structural.adapter;

/**
 * Created by Andrei on 13.04.2017.
 */
public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;


    @Override
    public void play(String autdioType, String fileName) {
        if("mp3".equalsIgnoreCase(autdioType)){
            System.out.println("playing mp3 file . name: "+fileName);
        }else if ("vlc".equalsIgnoreCase(autdioType)|| "mp4".equalsIgnoreCase(autdioType)){
            mediaAdapter=new MediaAdapter(autdioType);
            mediaAdapter.play(autdioType,fileName);
        }else{
            System.out.println("invalid meda. "+autdioType+" not recognized");
        }
    }
}
