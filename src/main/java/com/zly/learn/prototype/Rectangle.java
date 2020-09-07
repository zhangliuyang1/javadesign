package com.zly.learn.prototype;

/**
 * @Author: zhangliuyang01
 * @Date: 2020/9/4 17:39
 */
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("draw rectangle");
    }
}
