package com.herokuapp.automation.testscripts;

public class PrimeNum {
    public static void main(String[] args) {

        for (int i=1;i<100;i++)
            new PrimeNum().isPrime(i);
    }

    public void isPrime(int number){
        int i;
        for (i=2;number%i !=0;i++);

        if(number==i){
            System.out.println("Number is prime : "+number);
        }
    }
}
