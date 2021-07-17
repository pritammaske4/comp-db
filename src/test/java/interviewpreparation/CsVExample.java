package interviewpreparation;

import java.io.*;

public class CsVExample {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader( new File("C:\\test_projects_New\\src\\test\\resources\\testdata\\AddNewComputerTest.csv")));
        String line;
        while ((line=br.readLine())!=null){
            String lineArray[]= line.split("\\s*,\\s*");
            for (int i=0;i<lineArray.length;i++){
                System.out.print(" "+lineArray[i]);
            }
            System.out.println("");
        }
    }
}
