package com.zlj;

import java.util.Arrays;

/**
 * @Classname a5ShellSort
 * @Date 2020/8/4
 * @Created by 陈刀仔
 * @Description TODO
 */

public class a5ShellSort {
    public static void main(String[] args) {
        int[] a = new int[]{5, 8, 3, 9, 7, 6, 4, 0, 2, 1};
        sort(a, a.length / 2);
        System.out.println(Arrays.toString(a));
    }

    private static void sort(int[] a, int d) {
        while (d > 0) {
            for (int i = d; i < a.length; i++) {
                for (int j = i - d; j >= 0; j -= d) {
                    if (a[j] > a[j + d]) {
                        swap(a, j, j + d);
                    }
                }
            }
            d /= 2;
            sort(a, d);
        }
    }

    public static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
