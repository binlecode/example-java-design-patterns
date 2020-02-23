package sample.designpattern.adapter;

/**
 * Created with IntelliJ IDEA.
 * User: ble
 * Date: 8/25/13
 * Time: 9:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class AdapterPatternDemo {

    public static void main(String[] args) {

        MediaPlayer player = new AudioPlayer();

        player.play("VLC", "vlc-file.vlc");
        player.play("MP4", "mp4-file.mp4");

    }
}
