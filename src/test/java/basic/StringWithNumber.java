package basic;

public class StringWithNumber {

    public static void main(String[] args) {
        System.out.println("Sum : "+additionOfNumber("This4 is56 t1h7e t55"));
    }

    public static int additionOfNumber(String inputString){
        String numberString="";
        for (int i=0;i<inputString.length();i++){
            if (isNum(inputString.charAt(i))){
                numberString=numberString+inputString.charAt(i);
            }else {
                numberString=numberString+" ";
            }
        }

        int sum=0;
        String numArray[]=numberString.split(" ");
        for (int i=0;i<numArray.length;i++){
            if (numArray[i].length()>=1)
                sum=sum+Integer.parseInt(numArray[i]);
        }
        return sum;
    }

    public static boolean isNum(char ch){
        boolean isNum=false;
        if (ch>=48 & ch<=57)
            isNum=true;
        return isNum;
    }
}
