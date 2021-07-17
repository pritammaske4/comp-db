package interviewpreparation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintPrimeNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter start Number ....");
        int startNumber=Integer.parseInt(br.readLine());
        System.out.println("Enter end Number ....");
        int endNumber=Integer.parseInt(br.readLine());
        PrintPrimeNumbers printPrimeNumbers = new PrintPrimeNumbers();
        printPrimeNumbers.printPrimeNumbers(startNumber,endNumber);
    }

    private boolean isPrime(int number){
        boolean isPrime=false;
        if (number==1 || number==2)
            return true;

        for (int i=2;i<=number/2;i++){
            if (number%2==0){
                isPrime=true;
                break;
            }
        }
        return !isPrime;
    }

    private void printPrimeNumbers(int startNumber, int endNumber){
        for (int i=startNumber;i<=endNumber;i++){
            if (isPrime(i))
                System.out.print(" "+i);
        }
    }
}
