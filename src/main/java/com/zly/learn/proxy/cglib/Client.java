package com.zly.learn.proxy.cglib;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Author: zhangliuyang01
 * @Date: 2020/7/22 17:57
 */
public class Client {

    public static void main(String[] args) {
        CglibProxy cglibProxy = new CglibProxy();

        Object proxyObj1 = cglibProxy.createProxyObj(Person.class);
     ;
        Person proxyObj =(Person) proxyObj1;

        proxyObj.drink();
        proxyObj.eat();
    }
}
