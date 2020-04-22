package com.zly.learn.strategy;

/**
 * @Author: zhangliuyang01
 * @Date: 2020/4/22 18:38
 */
public class OperAdd implements Strategy {
    @Override
    public int doOper(int a, int b) {
        return a + b;
    }
}
