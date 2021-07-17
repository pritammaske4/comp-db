package com.herokuapp.automation.testscripts;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[]args)
    {
        int count = 0, max_count = 50, i;
        System.out.println("First "+max_count+" Prime Numbers:");

        for(int num=1; count<max_count; num++)
        {
            for(i=2; num%i != 0; i++);

            if(i != num)
            {
                System.out.print(" "+num);
                count++;
            }
        }
    }
}
