package algorithms.sort;

import algorithms.base.Example;

/**
 * 希尔排序
 * A.确定分区h
 * B.在分区h中，看成小段插入排序a[i] 插入 a[i-h],a[i-2h],a[i-n*h>0]  条件(i>=h)当中
 * C.缩短分区h。直到h变成1 其间一直重复B
 */
public class ShellSort extends Example {

    private static final Sort sort = a -> {
        int h = 1;
        int N = a.length;
        while (N > h) h = h * 3 + 1;
        System.out.println("h is " + h);
        while (h >= 1) {
            for (int i = 0; i < N; i++) {
                for (int j = i; j >= h && less(a[j], a[j - h]); j -= h) {
                    exch(a, j, j - h);
                }
            }
            h /= 3;
        }
    };


    public static void main(String[] args) {
        begain(sort);
    }
}
