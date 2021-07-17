package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactorialDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number for factorial");
        int num = Integer.parseInt(bufferedReader.readLine());

        int fact=1;

        for (int i=1; i<=num;i++){
            fact=fact*i;
        }

        System.out.println("Fact : "+fact);
    }
}
