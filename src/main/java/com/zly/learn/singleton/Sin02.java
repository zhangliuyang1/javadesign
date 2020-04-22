package com.zly.learn.singleton;

/**
 * 懒汉式
 * @Author: zhangliuyang01
 * @Date: 2020/4/22 18:50
 */
public class Sin02 {

    private static Sin02 INSTANCE;

    private Sin02() {
    }

    public static Sin02 getInstance() {
        if (INSTANCE == null){
            INSTANCE = new Sin02();
        }
        return INSTANCE;
    }
}
