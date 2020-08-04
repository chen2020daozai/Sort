package com.zlj;

import java.util.Arrays;

/**
 * @Classname a10RadixSort2
 * @Date 2020/8/4
 * @Created by 陈刀仔
 * @Description TODO
 */

public class a10RadixSort2 {
    public static void main(String[] args) {
        int[] arr = new int[]{23, 6, 9, 287, 56, 1, 789, 34, 65, 653};
        System.out.println(Arrays.toString(arr));
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void radixSort(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        int len = (max + "").length();

        int[] counts = new int[10];//每个余数的个数
        int[][] temp = new int[10][arr.length];//10个桶  每个桶放几个数

        for (int i = 0, n = 1; i < len; i++, n *= 10) {
            for (int j = 0; j < arr.length; j++) {
                int ys=(arr[j] / n) % 10;
                temp[ys][counts[ys]]=arr[j];
                counts[ys]++;
            }

            int index=0;
            for (int j = 0; j < 10; j++) {
                if (counts[j]!=0){
                    for (int k = 0; k < counts[j]; k++) {
                        arr[index++]=temp[j][k];
                    }
                }
                counts[j]=0;
            }
        }
    }
}
