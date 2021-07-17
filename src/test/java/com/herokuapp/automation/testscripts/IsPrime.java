package com.herokuapp.automation.testscripts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IsPrime {
    static public  void main(String[] args) throws IOException {
        System.out.println("Enter Number");
        int num=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int flag=1;
        num=Integer.parseInt(br.readLine());
        for(int i=2;i<num;i++){
            if (num%i==0){
                flag=0;
                break;
            }
        }
        if (flag==0){
            System.out.println("Not a prime Number");
        }else{
            System.out.println("It's prime Number");
        }
    }
}
