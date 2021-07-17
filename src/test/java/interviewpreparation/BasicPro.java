package interviewpreparation;

import java.io.*;
import java.util.Scanner;

public class BasicPro {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new FileReader(new File("")));
//
//        BufferedReader br1= new BufferedReader(new InputStreamReader(System.in));
//        br1.readLine();
//
//        Scanner scanner = new Scanner(System.in);
//
//        Console console = System.console();
//        console.readLine();


      try
        {
            methodWithThrow();
        }
        catch(NumberFormatException ex)
        {
            System.out.println("NumberFormatException object thrown in methodWithThrow() method will be handled here");
        }

    }

    static void methodWithThrow()
    {
        try
        {
            NumberFormatException ex = new NumberFormatException("This is an object of NumberFormatException");

//            throw ex;        //throwing NumberFormatException object explicitly using throw keyword
            throw new ArithmeticException();
        }
        catch(ArithmeticException ex)
        {
            System.out.println("Explicitly thrown NumberFormatException object will not be caught here");
        }
    }
}
