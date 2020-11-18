package com.zly.learn.bridge;

/**
 * @Author: zhangliuyang01
 * @Date: 2020/11/17 下午8:45
 */
public abstract class Shape {
    DrawApi drawApi;

    public Shape(DrawApi drawApi) {
        this.drawApi = drawApi;
    }

    public abstract void draw();
}
