package sample.designpattern.adapter;

/**
 * Created with IntelliJ IDEA.
 * User: ble
 * Date: 8/25/13
 * Time: 9:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class AudioPlayer implements MediaPlayer {
    @Override
    public void play(String audioType, String fileName) {
        if ("VLC".equalsIgnoreCase(audioType) || "MP4".equalsIgnoreCase(audioType)) {
            MediaAdapter mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }
    }

}
