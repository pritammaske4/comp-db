package test;

public class StringReverse {
    public static void main(String[] args) {
        String s ="dhiraj";
        System.out.println(reverseUsingRec(s));
    }

    private static String reverseUsingRec(String inputString){
        if(null==inputString || inputString.length()<=1)
            return inputString;
        return reverseUsingRec(inputString.substring(1))  +inputString.charAt(0);
    }
}   
