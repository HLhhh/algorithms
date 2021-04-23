package algorithms.sort;

import algorithms.base.Example;

/**
 * 选择排序
 * a.指针i （指定排序方式） （有序数组）（左数组）
 * b.指针j 在（无序数组中获取排序对象，插入左数组末尾）
 * c.循环j 插入i左数组
 */
public class SelectionSort extends Example {

    public static final Sort sort = a -> {
        int target;
        for (int i = 0; i < a.length; i++) {
            target = i;
            for (int j = i; j < a.length - 1; j++) {
                if (!less(a[target], a[j + 1]))
                    target = j + 1;
            }
            exch(a, i, target);
            show(a);
        }
    };

    public static void main(String[] args) {
        begain(sort);
    }
}
