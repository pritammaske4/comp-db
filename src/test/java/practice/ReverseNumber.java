package practice;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num= scanner.nextInt();
        int rem= 0;
        while (num>0){
            rem = rem*10+num%10;
            num = num/10;
        }
        System.out.println(rem);
    }
}
