package com.zly.learn.singleton;

/**
 * @Author: zhangliuyang01
 * @Date: 2020/4/22 18:53
 */
public class Sin04 {

    private static Sin04 INSTANCE;

    private Sin04() {
    }

    public static Sin04 getInstance() {
        if (INSTANCE == null) {
            synchronized (Sin04.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Sin04();
                }
            }
        }
        return INSTANCE;
    }
}
