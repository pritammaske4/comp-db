package practice;

import java.util.HashMap;
import java.util.Map;

public class CharCount {
    public static void main(String[] args) {
        String s= "geeksforgeeks";
        Map <Character,Integer> map = new HashMap<>();

        for (int i=0;i<s.length();i++){
            int count =1;

            if (!map.keySet().contains(s.charAt(i))) {
                for (int j = i + 1; j < s.length(); j++) {
                    if (s.charAt(j) == s.charAt(i)) {
                        count++;
                    }
                }
                map.put(s.charAt(i), count);
                System.out.println("Character : "+s.charAt(i)+" Count : "+count);
            }
        }
    }
}
