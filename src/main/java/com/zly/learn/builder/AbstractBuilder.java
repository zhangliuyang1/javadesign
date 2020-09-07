package com.zly.learn.builder;

/**
 * @Author: zhangliuyang01
 * @Date: 2020/9/7 14:17
 */
public abstract class AbstractBuilder {

    abstract void buildBoard(String board);
    abstract void buildDisplay(String display);
    abstract void buildOs();

    abstract Computer build();

}
