package algorithms.sort;

import algorithms.base.MergeExample;

import java.util.Arrays;

/**
 * 归并排序
 * a.制定好merge合并规则，参数包括目标数组、数组1的head&end 数组2的head&end
 * b.实现sort排序规则，实现分治思想（递归）
 */
public class MergeSort extends MergeExample {

    public final Sort sort = comparables -> {
        aux = new Comparable[comparables.length];
        sort(comparables, 0, comparables.length - 1);
    };


    public void sort(Comparable[] comparables, int head, int end) {

        if (end <= head) return;
        int mid = head + (end - head) / 2;
        sort(comparables, head, mid);
        sort(comparables, mid + 1, end);
        if (!less(comparables[mid], comparables[mid + 1]))
            merge(comparables, head, mid, end);
        show(comparables);
    }

    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        mergeSort.begain(mergeSort.sort);
    }
}
