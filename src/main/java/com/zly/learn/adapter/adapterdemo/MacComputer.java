package com.zly.learn.adapter.adapterdemo;

/**
 * @Author: zhangliuyang01
 * @Date: 2020/11/18 下午3:10
 */
public class MacComputer implements Computer {
    @Override
    public String readSd(SdCard sdCard) {
        if (sdCard == null) {
            throw new NullPointerException("sdcard is null");
        }
        return sdCard.readSd();
    }
}
