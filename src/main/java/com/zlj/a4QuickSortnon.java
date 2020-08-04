package com.zlj;

import java.util.Arrays;

/**
 * @Classname a4QuickSort
 * @Date 2020/8/4
 * @Created by 陈刀仔
 * @Description TODO
 */

public class a4QuickSortnon {
    public static void main(String[] args) {
        int[] a = new int[]{5, 8, 3, 9, 7, 6, 4, 0, 2, 1};
        sort(a, 0, a.length);
        System.out.println(Arrays.toString(a));
    }

    private static void sort(int[] a, int left, int right) {
        if (left >= right||right>a.length) return;
        int flag = a[left];
        int i = left + 1;
        int j = right - 1;
        while (true) {
            while (flag < a[j] && i < j) {
                j--;
            }
            while (flag > a[i] && i < j) {
                i++;
            }
            if (i < j) {
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            } else {
                int t = a[left];
                a[left] = a[j];
                a[j] = t;
                break;
            }
        }

        //递归
        sort(a, left, i);
        sort(a, i + 1, right);
    }


}
