package com.zlj;

import java.util.Arrays;

/**
 * @Classname a6MergeSort
 * @Date 2020/8/4
 * @Created by 陈刀仔
 * @Description TODO
 */

public class a6MergeSort {
    public static void main(String[] args) {
        int[] a = new int[]{5, 8, 3, 9, 7, 6, 4, 0, 2, 1};
        sort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

    /*
        拆分数组
        排序存入数组
     */
    public static void sort(int[] arr, int low, int high) {
        //当只剩下两个数的时候，low < high不满足
        int middle = (high + low) / 2;
        if (low < high) {
            sort(arr, low, middle);
            sort(arr, middle + 1, high);
            // 两个数组被拆分完成,进行归并的操作
            merge(arr, low, middle, high);
        }
    }

    public static void merge(int[] arr, int low, int middle, int high) {

        // 创造归并后的临时数组
        int[] temp = new int[high - low + 1];
        // 记录第一个数组需要遍历的下标
        int i = low;
        // 记录第二个数组需要遍历的下标
        int j = middle + 1;
        // 用于记录在临时数组中存放的下标
        int index = 0;
        // 遍历两个数组去除小弟数字，放入临时数组
        while (i <= middle && j <= high) {
            // 第一个数组的数更小
            if (arr[i] < arr[j]) {
                temp[index] = arr[i];
                // 下标后移
                i++;
                index++;
            } else {// 第二个数组更小
                temp[index] = arr[j];
                j++;
                index++;
            }
        }
        // 处理多余的数据（两个数组不等长，一方比完跳出循环）
        // 直接把剩余元素追加到数组之后
        while (j <= high) {
            temp[index] = arr[j];
            j++;
            index++;
        }

        while (i <= middle) {
            temp[index] = arr[i];
            i++;
            index++;
        }

        // 把临时数组赋给原数组
        for (int n = 0; n < temp.length; n++) {
            arr[n + low] = temp[n];
        }
    }


    public static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
