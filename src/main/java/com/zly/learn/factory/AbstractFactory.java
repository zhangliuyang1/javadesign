package com.zly.learn.factory;

/**
 * @Author: zhangliuyang01
 * @Date: 2020/5/8 11:51
 */
public abstract class AbstractFactory {

    public abstract Shape getShape(String shape);

    public abstract Color getColor(String color);

}
