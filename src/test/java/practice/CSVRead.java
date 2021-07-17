package practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CSVRead {
    public static void main(String[] args) {

        File f = new File("C:\\gitprojects\\Hawk-Demo\\csvData\\TestDataSheet.csv");
        if (f.exists()) {
            new CSVRead().readCSV("C:\\gitprojects\\Hawk-Demo\\csvData\\TestDataSheet.csv");
        }
        else{
            System.out.println("Found Does not exist");
        }
    }

    public void readCSV(String filePath){
        String[] data;
        String line;
        BufferedReader br = null;
        FileReader fileReader = null;
        List<Object[]> testDataArray= new ArrayList<>();
        List<Map<String,String>> testDataMap= new ArrayList<>();
        try {
            fileReader = new FileReader(filePath);
            br = new BufferedReader(fileReader);
            while ((line = br.readLine()) != null) {
                data = line.split("\\s*,\\s*");
                testDataArray.add(data);
            }

            for (int i=1;i<testDataArray.size();i++){
                Map<String,String> map = new HashMap<>();
                for (int j=0;j<testDataArray.get(0).length;j++){
                    map.put("int_"+testDataArray.get(0)[j].toString(),testDataArray.get(i)[j].toString());
                }
                testDataMap.add(map);
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        //Print Keys and Values
        for (int i=0;i<testDataMap.size();i++){
            for(String key : testDataMap.get(i).keySet()){
                System.out.println(key+" = "+testDataMap.get(i).get(key));
            }
        }


    }
}
