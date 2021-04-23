package algorithms.sort;

import algorithms.base.Example;

/**
 * 插入排序
 * a.指针i（0-i均为有序数组）
 * b.指针j 进行插入（0-i）的有序数组中进行排序
 * C.进行排序交换
 */
public class InsertionSort extends Example {

    public static final Sort sort = a -> {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--) {
                exch(a, j, j - 1);
                show(a);
            }
        }
    };


    public static void main(String[] args) {
        begain(sort);
    }
}
