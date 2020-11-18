package com.zly.learn.bridge;

/**
 * @Author: zhangliuyang01
 * @Date: 2020/11/17 下午8:47
 */
public class BridgeDemo {

    public static void main(String[] args) {

        Shape redCircle = new Circle(new RedCircle());
        Shape greenCircle = new Circle(new GreenCircle());

        redCircle.draw();;
        greenCircle.draw();

    }


}
