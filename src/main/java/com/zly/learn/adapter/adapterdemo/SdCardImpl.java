package com.zly.learn.adapter.adapterdemo;

/**
 * @Author: zhangliuyang01
 * @Date: 2020/11/18 下午3:05
 */
public class SdCardImpl implements SdCard {
    @Override
    public String readSd() {
        String msg  = "sdcard read msg : hello word";
        System.out.println(msg);
        return msg;
    }

    @Override
    public int writeSd(String msg) {
        System.out.println("sdcard write msg : " + msg);
        return 1;
    }
}
