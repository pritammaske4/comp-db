package practice;

import org.apache.commons.lang3.StringUtils;

public class BasicProgram {
    public static void main(String[] args) {
        String s="pritam";
        String reverse="";

        for (int i=s.length()-1;i>=0;i--){
            reverse=reverse+s.charAt(i);

        }
        System.out.println("Reverse String "+reverse);
        String alphanumeric="p1r2i3t4a5m";
        int sum=0;
        String stringArray[]=alphanumeric.split("");
        for (int i=0;i<stringArray.length;i++){
            if (StringUtils.isNumeric(stringArray[i])){
                sum =sum+Integer.parseInt(stringArray[i]);
            }
        }
        System.out.println(sum);

        String specialChar="p#r$i%t^a*m";
        String specialArray[]=specialChar.split("");

        for (int i=0;i<specialArray.length;i++){
            if (!StringUtils.isAlphanumeric(specialArray[i])){
                System.out.println(specialArray[i]);
            }
        }

        char charArray[]=alphanumeric.toCharArray();

        for (int i=0;i<charArray.length;i++){
            if (charArray[i]>=65 && charArray[i]<=90){
                System.out.println("capital Alphabet : "+charArray[i]);
            }

            if (charArray[i]>=97 && charArray[i]<=122){
                System.out.println("small Alphabet : "+charArray[i]);
            }

            if (charArray[i]>=48 && charArray[i]<=57 ){
                System.out.println("Digit : "+charArray[i]);
            }

            Character.isDigit('a');
            Character.isLetter('9');
            StringUtils.isAlphanumeric("");
        }
    }
}
