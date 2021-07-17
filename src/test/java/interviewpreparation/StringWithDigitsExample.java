package interviewpreparation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringWithDigitsExample {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter String");
        String inputString=br.readLine();
        String newString="";
        char charArray[]=inputString.toCharArray();
        int sum =0;

        for (char ch :charArray){
            if (isDigit(ch)){
                sum=sum+getNumericValue(ch);
            }else {
                newString=newString+ch;
            }
        }

        System.out.println("Add : "+sum);
        System.out.println("New String : "+newString);
    }

    private static boolean isDigit(char ch){
        boolean isDigit=false;
        if(ch>=48 && ch<=57)
            isDigit=true;
        return isDigit;
    }

    private static boolean isAlpha(char ch){
        boolean isDigit=false;
        if(ch>=65 && ch<=90 || ch>=97 && ch<=122)
            isDigit=true;
        return isDigit;
    }

    private static boolean isAlphaNumeric(char ch){
        boolean isDigit=false;
        if(ch>=48 && ch<=57 ||ch>=65 && ch<=90 || ch>=97 && ch<=122)
            isDigit=true;
        return isDigit;
    }

    private static int getNumericValue(char ch){
        return ch-'0';
    }
}

