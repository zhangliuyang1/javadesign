package com.zly.learn.builder;

/**
 * @Author: zhangliuyang01
 * @Date: 2020/9/7 14:38
 */
public class WindowsBookBuilder extends AbstractBuilder {

    private WindowsBook windowsBook = new WindowsBook();

    @Override
    void buildBoard(String board) {
        windowsBook.setBoard(board);
    }

    @Override
    void buildDisplay(String display) {
        windowsBook.setDisplay(display);
    }

    @Override
    void buildOs() {
        windowsBook.setOs();
    }

    @Override
    Computer build() {
        return windowsBook;
    }
}
