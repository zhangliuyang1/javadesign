package com.zly.learn.factory;

/**
 * 1.抽象工厂
 * 2。抽象产品
 * 3。具体工厂
 * 4。具体产品
 *
 * 工厂 抽象产品  具体产品
 * 抽象工厂 具体工厂  头像产品 具体产品
 *
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
