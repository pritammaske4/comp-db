package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class LargestEvenWord {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a sentence");

        String sentence = br.readLine();

        String wordArray[] = sentence.split(" ");
        int wordArrayLength=wordArray.length;
        Map<Integer,String> wordMap= new HashMap<>();

        for (int counter =wordArrayLength-1;counter>=0;counter--){
            Integer wordLength=wordArray[counter].length();
            if(wordLength%2==0){
                wordMap.put(wordLength,wordArray[counter]);
            }
        }

        int max=0;

        for(int length : wordMap.keySet()){
            if (max<length){
                max=length;
            }
        }
        System.out.println("Largest Even word : "+wordMap.get(max));
    }
}
