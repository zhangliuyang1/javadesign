package com.zly.learn.prototype;

/**
 * @Author: zhangliuyang01
 * @Date: 2020/9/4 17:40
 */
public class Square extends Shape {

    public Square() {
        type="square";
    }

    @Override
    void draw() {
        System.out.println("draw square");
    }
}
