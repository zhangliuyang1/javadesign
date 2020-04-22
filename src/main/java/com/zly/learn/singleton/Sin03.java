package com.zly.learn.singleton;

/**
 * @Author: zhangliuyang01
 * @Date: 2020/4/22 18:52
 */
public class Sin03 {
    private static Sin03 INSTANCE;

    private Sin03() {
    }

    public static synchronized Sin03 getInstance() {
        if (INSTANCE == null){
            INSTANCE = new Sin03();
        }
        return INSTANCE;
    }
}
