package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Enum_Example {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        System.out.println("Enter Range");
        try {
            Range userRange = Range.valueOf(br.readLine().toUpperCase());

            switch (userRange) {
                case HIGH:
                    System.out.println("It's high");
                    break;
                case LOW:
                    System.out.println("it is low");
                    break;
                case MEDIUM:
                    System.out.println("It is medium");
                    break;
            }
        }catch(IllegalArgumentException iAE){
            System.out.println(iAE.getMessage());
        }

        System.out.println("Printing all values of Range enum");
        for(Range range : Range.values()){
            System.out.println(range);
        }
        System.out.println("=========================Printing all values of Range enum - Normal For Loop ");
        for (int i=0;i<Range.values().length;i++){
            System.out.println(Range.values()[i]);
        }
    }
}

