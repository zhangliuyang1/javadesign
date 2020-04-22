package com.zly.learn.singleton;

/**
 *
 * @Author: zhangliuyang01
 * @Date: 2020/4/22 19:02
 */
public class Sin06 {
    private Sin06() {
    }

    private static class Sin06Holder {
        private static Sin06 INSTANCE = new Sin06();
    }

    public static Sin06 getInstance(){
        return Sin06Holder.INSTANCE;
    }
}
