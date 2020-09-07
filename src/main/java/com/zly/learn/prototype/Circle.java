package com.zly.learn.prototype;

/**
 * @Author: zhangliuyang01
 * @Date: 2020/9/4 17:41
 */
public class Circle extends Shape {
    public Circle() {
        type = "circle";
    }

    @Override
    void draw() {
        System.out.println("draw circle");
    }
}
