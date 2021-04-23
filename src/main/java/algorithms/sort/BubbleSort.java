package algorithms.sort;

import algorithms.base.Example;

/**
 * 冒泡排序
 * a.指针i 指定位（最小or最大）
 * b.指针j 比较位（从j指针开始比较）
 * c.交换i和j的元素位置
 */
public class BubbleSort extends Example {

    public static final Sort sort = a -> {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (!less(a[i], a[j])) {
                    exch(a, i, j);
                    show(a);
                }
            }
        }
    };

    public static void main(String[] args) {
        begain(sort);
    }
}
