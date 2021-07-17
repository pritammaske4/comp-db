package basic;

import java.util.Scanner;

public class NextPrime {
    public static void main(String[] args) {
        System.out.println("Enter a number");

        int number= new Scanner(System.in).nextInt();

        int temp =0;

        for (int i=number+1;;i++){

            for (int j=2;j<i;j++){
                if (i%j==0){
                    temp=1;
                    break;
                }
            }
            if (temp==0){
                System.out.println("Next Prime Number : "+i);
                break;
            }
            temp=0;
        }
    }
}
