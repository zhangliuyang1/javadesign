package com.zly.learn.builder;

/**
 * @Author: zhangliuyang01
 * @Date: 2020/9/7 14:30
 */
public class Director {
    AbstractBuilder builder = null;

    public Director(AbstractBuilder builder) {
        this.builder = builder;
    }

    public void construct(String board,String display){
        builder.buildBoard(board);
        builder.buildDisplay(display);
        builder.buildOs();
    }
}
