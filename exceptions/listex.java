package exceptions;

import java.util.ArrayList;
import java.util.List;

/**
 * listex
 */
public class listex {

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();

        l.add(12);
        l.add(20);
        l.add(81);
        l.add(92);
        l.add(28);
        l.add(30);
        // // for (Integer e : l) {
        //     System.out.println(e);
        // }

        l.forEach(e -> System.out.println(e));

        l.forEach(System.out::println);
    }
}