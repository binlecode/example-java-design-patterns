package sample.designpattern.adapter;

/**
 * Created with IntelliJ IDEA.
 * User: ble
 * Date: 8/25/13
 * Time: 9:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class VlcPlayer implements AdvancedMediaPlayer {


    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // do nothing
    }
}
