package com.zly.learn.adapter;

/**
 * @Author: zhangliuyang01
 * @Date: 2020/11/17 下午4:52
 */
public class AdVlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("playing vlc file.name:" + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("do nothing:" + fileName);
    }
}
