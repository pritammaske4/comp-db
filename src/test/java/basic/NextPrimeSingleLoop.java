package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NextPrimeSingleLoop {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Number");
        int number=Integer.parseInt(br.readLine());

        number=number+1;
        boolean flag=true;

        for (int i=2;i<number;i++){
            if(number%i==0){
                flag=false;
                number++;
                i=2;
            }else {
                flag=true;
            }

            if (flag & (number-1)==i){
                System.out.println("Next Prime Number : "+number );
            }
        }
    }
}
