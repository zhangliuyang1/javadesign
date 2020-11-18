package com.zly.learn.adapter.adapterdemo;

/**
 * @Author: zhangliuyang01
 * @Date: 2020/11/18 下午3:15
 */
public class TfCardImpl implements TfCard {
    @Override
    public String readTf() {
        String msg = "tfcard read msg : hello word";
        System.out.println(msg);
        return msg;
    }

    @Override
    public int writeTf(String msg) {
        System.out.println("tfcard write msg:" + msg);
        return 1;
    }
}
