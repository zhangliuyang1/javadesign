package com.zly.learn.proxy.jdkproxy;

/**
 * @Author: zhangliuyang01
 * @Date: 2020/7/22 16:56
 */
public class RealSubject1 implements AbstractSubject {
    @Override
    public void request() {
        System.out.println("RealSubject1");
    }
}
