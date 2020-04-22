package com.zly.learn.strategy;

import java.util.Arrays;

/**
 * @Author: zhangliuyang01
 * @Date: 2020/4/22 17:05
 */
public class Main {

    public static void main(String[] args) {

//        int[] arr = {1,3,5,2,4,8,9,6};
//
//        System.out.println(Arrays.toString(Sorter.sort(arr)));

        ContextStrategy context = new ContextStrategy();
        context.setStrategy(new OperAdd());
        System.out.println(context.doOper(10, 5));
        context.setStrategy(new OperSub());
        System.out.println(context.doOper(10, 5));
        context.setStrategy(new OperMulti());
        System.out.println(context.doOper(10, 5));


    }

}
