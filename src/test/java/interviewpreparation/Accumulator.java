package interviewpreparation;

import java.util.*;

public class Accumulator {
    public static String accum(String s) {

        String stringArray[] = s.toLowerCase().split("");
        StringJoiner joiner = new StringJoiner("-");
        for (int i = 0; i < stringArray.length; i++) {
            String capital = stringArray[i].toUpperCase();
            String small = "";
            for (int j = 0; j < i; j++) {
                small = small + stringArray[i];
            }
            joiner.add(capital + small);
        }
        return String.valueOf(joiner);
    }

    public static void main(String[] args) {
        System.out.println(accum("ZpglnRxqenU"));
    }

}
