package org.limewire.player.api;


import java.util.EventListener;
import java.util.Map;

/**
 * Listener for events generated by the AudioPlayer.
 */
public interface AudioPlayerListener extends EventListener {

	/**
     * Open callback, stream is ready to play.
     * <p>
     * properties map includes audio format dependant features such as bitrate,
     * duration, frequency, channels, number of frames, vbr flag, id3v2/id3v1
     * (for MP3 only), comments (for Ogg Vorbis), ...
     * 
     * @param properties audio stream properties.
     */
    public void songOpened(Map<String,Object> properties);

    /**
     * Progress callback while playing.
     * <p>
     * This method is called severals time per seconds while playing.properties
     * map includes audio format features such as instant bitrate, microseconds
     * position, current frame number, ...
     * 
     * @param bytesread from encoded stream
     */
    public void progressChange(int bytesread);

    /**
     * Notification callback for basicplayer events such as opened, eom ...
     *
     */
    public void stateChange(AudioPlayerEvent event);
}

