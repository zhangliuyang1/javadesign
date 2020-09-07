package com.zly.learn.builder;

/**
 * @Author: zhangliuyang01
 * @Date: 2020/9/7 14:28
 */
public class MacBookBuilder extends AbstractBuilder {


    private Computer computer = new MacBook();

    @Override
    void buildBoard(String board) {
        computer.setBoard(board);
    }

    @Override
    void buildDisplay(String display) {
        computer.setDisplay(display);
    }

    @Override
    void buildOs() {
        computer.setOs();
    }

    @Override
    Computer build() {
        return computer;
    }
}
