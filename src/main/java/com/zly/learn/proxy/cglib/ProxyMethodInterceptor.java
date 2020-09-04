package com.zly.learn.proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author: zhangliuyang01
 * @Date: 2020/9/3 17:34
 */
public class ProxyMethodInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("do 前置处理");
        Object o1 = methodProxy.invokeSuper(o, objects);
        System.out.println("do 后置处理");
        return o1;
    }
}
