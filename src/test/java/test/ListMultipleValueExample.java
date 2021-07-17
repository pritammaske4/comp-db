package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListMultipleValueExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,4,4);

        System.out.println(Collections.frequency(list,4));
        System.out.println(Math.abs(-1));
    }
}
