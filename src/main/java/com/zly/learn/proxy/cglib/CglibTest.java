package com.zly.learn.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * @Author: zhangliuyang01
 * @Date: 2020/9/3 17:34
 */
public class CglibTest {

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Person.class);
        enhancer.setCallback(new ProxyMethodInterceptor());
        Object o = enhancer.create();
        Person person = (Person)o;

        person.eat();

    }
}
