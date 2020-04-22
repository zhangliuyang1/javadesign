package com.zly.learn.singleton;

/**
 *  饿汉式--线程安全
 * @Author: zhangliuyang01
 * @Date: 2020/4/22 18:49
 */
public class Sin01 {
    private static Sin01 INSTANCE = new Sin01();

    private Sin01() {
    }

    public static Sin01 getInstance() {
        return INSTANCE;
    }
}
