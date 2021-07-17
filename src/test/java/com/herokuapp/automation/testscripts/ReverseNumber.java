package com.herokuapp.automation.testscripts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseNumber {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a number : ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int rev=0;

        while(num>0){
            rev= rev*10+num%10;
            num=num/10;
        }
        System.out.println("Reverse is : "+rev);
    }
}
