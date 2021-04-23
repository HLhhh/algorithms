package algorithms.base;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;


public abstract class Example extends Base{

    public static void begain(Sort sort) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("begain");
        String[] next = scanner.next().split("[,]");
        sort.accept(next);
        assert isSorted(next);
        show(next);
    }

    public interface Sort extends Consumer<Comparable[]> {

    }
}

