package com.zly.learn.proxy.cglib;

import sun.reflect.misc.ReflectUtil;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Author: zhangliuyang01
 * @Date: 2020/9/3 16:37
 */
public class RelectTest {

    public static void main(String[] args) throws Exception {
        Class<Person> clazz = (Class<Person>) Class.forName("com.zly.learn.proxy.cglib.Person");
        Object o = ReflectUtil.newInstance(clazz);

        Person person = clazz.newInstance();
        Class<? extends Class> aClass = clazz.getClass();
        Constructor<Person> constructor = clazz.getConstructor();
        Person person1 = constructor.newInstance();

        Constructor<Person> constructor1 = clazz.getConstructor(String.class);
        Person person2 = constructor1.newInstance("111");

        ClassLoader classLoader = clazz.getClassLoader();

        Field[] fields = clazz.getFields();
        Field[] declaredFields = clazz.getDeclaredFields();
        Method[] declaredMethods = clazz.getDeclaredMethods();
        Method[] methods = clazz.getMethods();
        Field field = clazz.getDeclaredField("name");
        Field sex = clazz.getDeclaredField("SEX");
        field.setAccessible(true);
        field.set(o,"hahaha");

        Method eat = clazz.getDeclaredMethod("eat");
        Method eat1 = clazz.getDeclaredMethod("eat", int.class);
        eat.invoke(o);
        eat1.invoke(o,1);


        System.out.println(o);
    }
}
