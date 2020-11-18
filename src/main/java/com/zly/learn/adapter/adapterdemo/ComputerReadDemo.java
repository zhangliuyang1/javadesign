package com.zly.learn.adapter.adapterdemo;

/**
 * @Author: zhangliuyang01
 * @Date: 2020/11/18 下午3:11
 */
public class ComputerReadDemo {

    public static void main(String[] args) {
        Computer computer = new MacComputer();
        SdCard sdCard = new SdCardImpl();
        String readSd = computer.readSd(sdCard);
        System.out.println("==========");


        TfCard tfCard = new TfCardImpl();
        SdCard tfAdapterSd = new SdAdapterTf(tfCard);
        computer.readSd(tfAdapterSd);
    }
}
