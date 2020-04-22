package com.zly.lean.strategy;

/**
 * @Author: zhangliuyang01
 * @Date: 2020/4/22 17:13
 */
public class Cat {
    private int weight;
    private int height;

    public Cat(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    public int compareTo(Cat t){
        if (this.weight < t.weight) return -1;
        else if (this.weight > t.weight) return 1;
        else return 0;
    }
}
