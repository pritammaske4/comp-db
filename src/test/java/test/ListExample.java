package test;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    static List<String> list = new ArrayList();


    public static void main(String[] args) {
        int q=2;
        for (int i=0;i<q;i++){
            String s1 = new String("Pritam");
            list.add(s1);
        }
        System.out.println();
    }
}
