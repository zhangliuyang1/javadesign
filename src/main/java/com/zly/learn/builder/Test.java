package com.zly.learn.builder;

/**
 * @Author: zhangliuyang01
 * @Date: 2020/9/7 14:32
 */
public class Test {


    public static void main(String[] args) {
        MacBookBuilder macBookBuilder = new MacBookBuilder();
        Director director = new Director(macBookBuilder);
        director.construct("cherry","guanjie");
        Computer build = macBookBuilder.build();
        System.out.println(build.toString());



        WindowsBookBuilder windowsBookBuilder = new WindowsBookBuilder();
        Director director1 = new Director(windowsBookBuilder);
        director1.construct("wcherry","wdell");
        Computer build1 = windowsBookBuilder.build();
        System.out.println(build1.toString());


    }
}
