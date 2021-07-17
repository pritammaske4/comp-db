package com.herokuapp.automation.testscripts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Prime {

    public void printPrime(int number){
        boolean isPrime=true;
        for (int i=2;i<number/2;i++){
            if (number%i==0){
                isPrime=false;
                break;
            }
        }

        if (isPrime){
            System.out.println(""+number);
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Enter outer range : ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((System.in)));
        int number= Integer.parseInt(bufferedReader.readLine());
//        for (int i=2;i<=number;i++)
            new Prime().printPrime(number);
    }
}
