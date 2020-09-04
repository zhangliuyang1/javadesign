package com.zly.learn.proxy.cglib;

/**
 * @Author: zhangliuyang01
 * @Date: 2020/7/22 17:56
 */
public class Person {

    public static String SEX = "male";

    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }



    public void eat(){
        System.out.println("eat food");
    }

    public void eat(int a){
        System.out.println("eat a" + a);
    }

    public void drink(){
        System.out.println("drink beer");
    }

    private void walk(){
        System.out.println("walk");
    }
}
