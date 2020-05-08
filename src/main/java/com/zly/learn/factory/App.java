package com.zly.learn.factory;

/**
 * @Author: zhangliuyang01
 * @Date: 2020/5/8 13:50
 */
public class App {



    public static void main(String[] args) {

        AbstractFactory color = FactoryProducer.getFactory("color");
        Color red = color.getColor("red");
        red.fill();
        AbstractFactory shape = FactoryProducer.getFactory("shape");
        Shape circle = shape.getShape("circle");
        circle.draw();
    }
}
