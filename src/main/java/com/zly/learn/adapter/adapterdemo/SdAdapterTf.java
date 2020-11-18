package com.zly.learn.adapter.adapterdemo;

/**
 * @Author: zhangliuyang01
 * @Date: 2020/11/18 下午3:21
 */
public class SdAdapterTf implements SdCard {

    private TfCard tfCard;

    public SdAdapterTf(TfCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSd() {
        System.out.println("adapter read tfcard ");
        return tfCard.readTf();
    }

    @Override
    public int writeSd(String msg) {
        System.out.println("adapter write tfcard ");
        return tfCard.writeTf(msg);
    }
}
