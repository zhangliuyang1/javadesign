package com.zly.learn.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: zhangliuyang01
 * @Date: 2020/7/22 16:57
 */
public class DynamicProxy<T> implements InvocationHandler {

    private T object;

    public DynamicProxy(T object) {
        this.object = object;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(object, args);
    }

    public Object createProxyObj() {
        return Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), this);
    }
}
