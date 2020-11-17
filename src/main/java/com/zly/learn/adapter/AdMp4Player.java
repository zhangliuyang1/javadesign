package com.zly.learn.adapter;

/**
 * @Author: zhangliuyang01
 * @Date: 2020/11/17 下午4:58
 */
public class AdMp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("do nothing:"+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("playing mp4 file.name");
    }
}
