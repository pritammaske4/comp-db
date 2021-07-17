package test;

public class ReverseNumber {
     int reverse=0;
    public static void main(String[] args) {
        System.out.println(new ReverseNumber(). reverseRec(123));
    }


    private  int reverseRec(int num){
        if (num>0){
            reverse = reverse*10+num%10;
            reverseRec(num/10);
        }
        return reverse ;
    }
}
