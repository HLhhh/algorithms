package algorithms.base;

import java.util.Arrays;

public class Base {

    public static boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }

    public static void exch(Comparable[] comparables, int i, int j) {
        Comparable k = comparables[i];
        comparables[i] = comparables[j];
        comparables[j] = k;
        k = null; // help GC
    }

    public static void show(Comparable[] comparables) {
        Arrays.stream(comparables).forEach(System.out::print);
        System.out.println();
    }

    public static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) return false;
        }
        return true;
    }
}
