package com.example.pattern.adapt;

/**
 * <p>create at 2019/5/16</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        // do nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file .Name: " + fileName);
    }
}
