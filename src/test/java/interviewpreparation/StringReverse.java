package interviewpreparation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringReverse {
    public static void main(String[] args) throws IOException {

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter String ...");
        String inputString= br.readLine();
        if(inputString!=null) {
            StringReverse stringReverse = new StringReverse();
            stringReverse.reverseStringUsingToCharArray(inputString);
            stringReverse.reverseStringUsingReverseFunction(inputString);
            String reverseString = stringReverse.reverseStringRecursive(inputString, "", inputString.length());
            System.out.println("Using recursion : " + reverseString);
            String reverse=stringReverse.recursiveReverse(inputString);
            System.out.println("Using Simple Recursion : "+reverse);
        }
    }

    private void reverseStringUsingToCharArray(String inputString){
        System.out.println("Using toCharArray");
        String reverseString="";
        char [] charArray=inputString.toCharArray();

        for(int i=charArray.length-1;i>=0;i--){
            reverseString=reverseString+charArray[i];
        }
        System.out.println("Reverse String : "+reverseString);
    }

    private void reverseStringUsingReverseFunction(String inputString){
        System.out.println("Using String Buffer reverse");
        StringBuffer s = new StringBuffer(inputString);
        StringBuffer reverseString =s.reverse();
        System.out.println("Reverse String : "+reverseString);
    }

    private String reverseStringRecursive(String inputString,String reverse,int length){
        if ( length==0)
            return reverse;
        return reverseStringRecursive(inputString,reverse+inputString.charAt(length-1),length-1);
    }

    private String recursiveReverse(String inputString){
        if (null==inputString || inputString.length()<=1)
            return inputString;
        return recursiveReverse(inputString.substring(1))+inputString.charAt(0);
    }
}
