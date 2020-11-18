package com.zly.learn.bridge;

/**
 * @Author: zhangliuyang01
 * @Date: 2020/11/17 下午8:39
 */
public class GreenCircle implements DrawApi {
    @Override
    public void draw() {
        System.out.println("Green Circle.draw");
    }
}
