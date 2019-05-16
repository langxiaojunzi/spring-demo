package com.example.pattern.adapt;

/**
 * <p>create at 2019/5/16</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // do nothing
    }
}
