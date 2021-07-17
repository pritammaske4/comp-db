package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ScannerClassExample {
    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter you name ");
//        String name = scanner.nextLine();
//        System.out.println("Welcome "+name+" .....");
        new ScannerClassExample().readDataUsingBufferedReader();
    }

    private  void readDataUsingBufferedReader() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Entr your name ");
        String name =bufferedReader.readLine();
        System.out.println("Welcome "+name+" .....");
    }
}
