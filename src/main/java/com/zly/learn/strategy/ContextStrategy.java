package com.zly.learn.strategy;

/**
 * @Author: zhangliuyang01
 * @Date: 2020/4/22 18:40
 */
public class ContextStrategy {

    private Strategy strategy;

    public ContextStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public ContextStrategy() {
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int doOper(int a, int b) {
        return strategy.doOper(a, b);
    }
}
