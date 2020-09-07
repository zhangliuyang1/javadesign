package com.zly.learn.prototype;


/**
 * @Author: zhangliuyang01
 * @Date: 2020/9/4 17:48
 */
public class App {
    public static void main(String[] args) {
        ShareCache.loadCache();

        Shape circle1 = ShareCache.getShape("1");
        Shape circle2 = ShareCache.getShape("1");
        System.out.println("Shape:" + circle1.getType());

        Shape shape2 = ShareCache.getShape("2");
        System.out.println("Shape:" + shape2.getType());

        Shape shape3 = ShareCache.getShape("3");
        System.out.println("Shape:" + shape3.getType());


    }
}
