package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LargestEvenWord1 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a sentence");

        String sentence = br.readLine();

        String wordArray[] = sentence.split(" ");
        int wordArrayLength=wordArray.length;

        int max=0;
        String maxLengthWord="";

        for (int i=0;i<wordArrayLength;i++){
            int len=wordArray[i].length();

            if( max<len && len%2==0 ){
                max=len;
                maxLengthWord=wordArray[i];
            }
        }
        System.out.println("Max word length : "+maxLengthWord);
    }
}
