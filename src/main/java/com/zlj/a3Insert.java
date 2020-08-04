package com.zlj;

import java.util.Arrays;

/**
 * @Classname a3Insert
 * @Date 2020/8/4
 * @Created by 陈刀仔
 * @Description TODO
 */

public class a3Insert {
    public static void main(String[] args) {
        int[] a = new int[]{5, 8, 3, 9, 7, 6, 4, 0, 2, 1};
        sort(a, a.length);
        System.out.println(Arrays.toString(a));
    }

    private static void sort(int[] a, int length) {
        //不满足while直接不动，i+1,满足就是记录current的数据，给不满足那个位置

        int current;
        for (int i = 1; i < length; i++) {
            current = a[i];
            int preIndex = i - 1;
            while (preIndex >= 0 && current < a[preIndex]) {
                a[preIndex+1]=a[preIndex];
                preIndex--;
            }
            a[preIndex+1]=current;
        }
    }
}
