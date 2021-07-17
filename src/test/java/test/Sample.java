package test;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Sample {
    public static void main(String[] args) throws UnknownHostException {
        System.out.println(InetAddress.getLocalHost().getHostAddress());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num : ");
        int num = scanner.nextInt();
        int i =0;
        for (i=2;num%i!=0;i++);

        System.out.println("Value of i : "+i);
        if (i==num){
            System.out.println("prime numer");
        }else{
            System.out.println("not prime");
        }
    }
}
