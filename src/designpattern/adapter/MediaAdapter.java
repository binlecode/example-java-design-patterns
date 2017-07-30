package sample.designpattern.adapter;

/**
 * This class adapts {@link sample.designpattern.adapter.AdvancedMediaPlayer} to
 * {@link sample.designpattern.adapter.MediaPlayer}
 */
public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String mediaType) {
        if ("VLC".equalsIgnoreCase(mediaType)) {
            this.advancedMediaPlayer = new VlcPlayer();
        } else if ("MP4".equalsIgnoreCase(mediaType)) {
            this.advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if ("VLC".equalsIgnoreCase(audioType)) {
            advancedMediaPlayer.playVlc(fileName);
        } else if ("MP4".equalsIgnoreCase(audioType)) {
            advancedMediaPlayer.playMp4(fileName);
        }
    }

}
