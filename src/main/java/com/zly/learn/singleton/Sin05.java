package com.zly.learn.singleton;

/**
 * @Author: zhangliuyang01
 * @Date: 2020/4/22 19:01
 */
public class Sin05 {
    private static volatile Sin05 INSTANCE;

    private Sin05() {
    }

    public static Sin05 getInstance() {
        if (INSTANCE == null) {
            synchronized (Sin05.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Sin05();
                }
            }
        }
        return INSTANCE;
    }
}
