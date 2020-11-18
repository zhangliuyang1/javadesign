package com.zly.learn.bridge;

/**
 * @Author: zhangliuyang01
 * @Date: 2020/11/17 下午8:46
 */
public class Circle extends Shape {

    public Circle(DrawApi drawApi) {
        super(drawApi);
    }


    @Override
    public void draw() {
        drawApi.draw();
    }
}
