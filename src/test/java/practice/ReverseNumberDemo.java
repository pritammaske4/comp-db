package practice;

import java.util.Scanner;

public class ReverseNumberDemo {


    public int  reverseFunction(int no){

        int rem = 0;

        while (no > 0) {
            rem = rem * 10 + no % 10;
            no = no / 10;
        }
        return rem;
    }


    public void checkPalindrome(int num){
        if(reverseFunction(num)==num){
            System.out.println("Number is Palindrome");
        }else {
            System.out.println("Number is not Palindrome");
        }

    }


    public static void main(String[] args) {
        ReverseNumberDemo reverseNumberDemo= new ReverseNumberDemo();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int no =scanner.nextInt();
        System.out.println("Reverse : "+reverseNumberDemo.reverseFunction(no));
        reverseNumberDemo.checkPalindrome(no);
    }
}
