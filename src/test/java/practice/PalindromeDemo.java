package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PalindromeDemo {

    public int reverseFunction(int no) {
        int rem = 0;
        while (no > 0) {
            rem = rem * 10 + no % 10;
            no = no / 10;
        }
        return rem;
    }
    public void palindrome(int no){
        if(no ==reverseFunction(no)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }

    public static void main(String[] args) throws IOException {
        PalindromeDemo palindromeDemo = new PalindromeDemo();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        palindromeDemo.reverseFunction(number);
        System.out.println("Reverse : "+palindromeDemo.reverseFunction(number));
        palindromeDemo.palindrome(number);


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the num");
        int numberInput = Integer.parseInt(bufferedReader.readLine());
    }
}
