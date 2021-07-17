package interviewpreparation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumber {
    public static void main(String[] args) throws IOException {

        PrimeNumber primeNumber= new PrimeNumber();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Number : ");
        int num=Integer.parseInt(br.readLine());


        if(primeNumber.isPrime(num)){
            System.out.println("Number : "+num+ " is  prime");
        }else{
            System.out.println("Number : "+num+ " is not prime");
        }
    }

    private boolean isPrime(int num){
        boolean isPrime = false;
        if(num==1 || num==2)
            return true;
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                isPrime=true;
                break;
            }
        }
        return !isPrime;
    }

}
