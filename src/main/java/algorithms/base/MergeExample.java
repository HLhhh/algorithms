package algorithms.base;

import java.util.Scanner;
import java.util.function.Consumer;

public abstract class MergeExample extends Base {

    public Comparable[] aux;

    public interface Sort extends Consumer<Comparable[]> {

    }

    public void merge(Comparable[] comparables, int lo, int mid, int hi) {
        Comparable[] a = comparables;
        int i = lo;
        int j = mid + 1;
        int end = hi;

        for (int k = lo; k <= end; k++) {
            aux[k] = a[k];
        }

        for (int k = lo; k <= end; k++) {
            if (i > mid)
                a[k] = aux[j++];
            else if (j > hi)
                a[k] = aux[i++];
            else if (less(aux[i], aux[j]))
                a[k] = aux[i++];
            else
                a[k] = aux[j++];
            show(a);
        }
    }

    public static void begain(MergeExample.Sort sort) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("begain");
        String[] next = scanner.next().split("[,]");
        sort.accept(next);
        assert isSorted(next);
        show(next);
    }
}
