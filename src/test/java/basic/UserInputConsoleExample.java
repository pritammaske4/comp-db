package basic;

import java.io.Console;

public class UserInputConsoleExample {
    public static void main(String[] args) {
        Console  console = System.console();
        System.out.println("Enter your Name ");
        String name= console.readLine();
        System.out.println("Welcome  "+name+"  .....");
    }
}
