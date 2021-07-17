package basic;

import java.io.*;
import java.util.*;

public class ReadCSV {
    public static void main(String[] args) throws IOException {
        Iterator it = new ReadCSV().readCSV();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

    public Iterator<Object[]> readCSV() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File("C:/Users/maskepri/Desktop/sample.csv")));
        String line;
        String lineArray[];
        List<Object[]> dataList= new ArrayList<>();
        while ((line=br.readLine())!=null){
            lineArray=line.split(",");
            for (int i=0;i<lineArray.length;i++){
                System.out.print(" "+lineArray[i]);
            }
            System.out.println();
            dataList.add(lineArray);
        }
        return dataList.iterator();
    }
}
