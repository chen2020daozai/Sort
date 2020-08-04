package com.zlj;

import java.util.Arrays;

/**
 * @Classname a2Select
 * @Date 2020/8/4
 * @Created by 陈刀仔
 * @Description TODO
 */

public class a2Select {
    public static void main(String[] args) {
        int[] a = new int[]{5, 8, 3, 9, 7, 6, 4, 0, 2, 1};
        sort(a, a.length);
        System.out.println(Arrays.toString(a));
    }

    private static void sort(int[] a, int length) {
        int index = 0;
        int min;
        for (int j = 0; j < length - 1; j++) {
            min = index;//假设最小值
            for (int i = index; i < length; i++) {

                if (a[i] < a[min]) {
                    min = i;//最小值坐标
                }
            }
            swap(a, min, index);
            index++;
        }
    }

    public static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
