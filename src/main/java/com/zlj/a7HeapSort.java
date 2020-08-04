package com.zlj;

import java.util.Arrays;

/**
 * 第一次创建大根堆，
 *      子节点如果为max，子节点交换父节点，子节点为根节点的子树可能不是大根堆，需要make
 * 把根固定到最后一位，维护前面的堆，成大根堆
 *
 * @Classname a7HeapSort
 * @Date 2020/8/4
 * @Created by 陈刀仔
 * @Description TODO
 */

public class a7HeapSort {
    public static void main(String[] args) {
        int[] a = new int[]{9, 6, 8, 7, 0, 1, 10, 4, 2};
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    private static void sort(int[] a) {
        //创建大根堆
        for (int i = a.length / 2; i >= 0; i--) {
            makeHeap(a, a.length, i);
            System.out.println();
        }

        for (int i = a.length - 1; i >= 0; i--) {
            swap(a, i, 0);
            makeHeap(a,i,0);
            System.out.println();
        }
    }

    public static void makeHeap(int arr[], int length, int parent) {
        int leftNode = 2 * parent + 1;
        int rightNode = 2 * parent + 2;

        int max = parent;

        //找出最大，子比父大就往上走，一直到根节点
        if (leftNode < length && arr[leftNode] > arr[max]) {
            max = leftNode;
        }
        if (rightNode < length && arr[rightNode] > arr[max]) {
            max = rightNode;
        }

        // 交换变量
        int temp;
        // 如果最大值变化，代表需要移动
        if (max != parent) {
            temp = arr[max];
            arr[max] = arr[parent];
            arr[parent] = temp;
            // 交换之后，可能会破坏原来的顺序，需要继续向下查看，max是子节点的下标，子节点为根节点的子树可能被破坏
            makeHeap(arr, length, max);
        }
        System.out.print(Arrays.toString(arr));
    }

    public static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
