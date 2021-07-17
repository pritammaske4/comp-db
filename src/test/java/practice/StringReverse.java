package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringReverse {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter string ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputString = bufferedReader.readLine();
        String reverseString=reverseRecursive(inputString);
        System.out.println(reverseString);
    }

    private static String reverseRecursive(String inputString){
        if (null==inputString || inputString.length()<=1)
            return inputString;
        return reverseRecursive(inputString.substring(1))+ inputString.charAt(0) ;

    }
}
