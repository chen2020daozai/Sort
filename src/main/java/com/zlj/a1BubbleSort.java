package com.zlj;

import java.util.Arrays;

/**
 * 冒泡排序
 * @Classname Sortpop
 * @Date 2020/8/4
 * @Created by 陈刀仔
 * @Description TODO
 */

public class a1BubbleSort {
    public static void main(String[] args) {
        int[] a=new int[]{5,8,3,9,7,6,4,0,2,1};
        sort(a,a.length);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int[] a,int length){
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (a[j]>a[j+1]){
                    swap(a,j,j+1);
                }
            }
        }
    }

    public static void swap(int[] a,int i,int j){
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
}