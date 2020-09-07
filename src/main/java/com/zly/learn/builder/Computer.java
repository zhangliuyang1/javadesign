package com.zly.learn.builder;

/**
 * @Author: zhangliuyang01
 * @Date: 2020/9/7 14:22
 */
public abstract class Computer {
    protected String board;
    protected String display;

    protected String os;

    public Computer() {
    }

    public String getBoard() {
        return board;
    }

    public void setBoard(String board) {
        this.board = board;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }


    public abstract void setOs();


    @Override
    public String toString() {
        return "Computer{" +
                "board='" + board + '\'' +
                ", display='" + display + '\'' +
                ", os='" + os + '\'' +
                '}';
    }
}
