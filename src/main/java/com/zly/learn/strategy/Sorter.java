package com.zly.learn.strategy;

/**
 * @Author: zhangliuyang01
 * @Date: 2020/4/22 17:06
 */
public class Sorter {

    public static int[] sort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i+1; j < arr.length; j++) {
                minPos = arr[j] < arr[minPos] ? j : minPos;
            }
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }
        return arr;
    }
}
