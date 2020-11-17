package com.zly.learn.adapter;

/**
 * @Author: zhangliuyang01
 * @Date: 2020/11/17 下午5:09
 */
public class AdapterPatternDemo {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3","Beyond the horizon.mp3");
        audioPlayer.play("mp4","top gun.mp4");
        audioPlayer.play("vlc","far away.vlc");
        audioPlayer.play("avi","mind me.avi");
    }
}
