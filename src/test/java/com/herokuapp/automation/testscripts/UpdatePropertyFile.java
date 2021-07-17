package com.herokuapp.automation.testscripts;

import java.io.*;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class UpdatePropertyFile {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter File Name :");
        String filename=br.readLine();
        File file = new File(filename);
        InputStream in  = new FileInputStream(file);
        properties.load(in);


        Set<Map.Entry<Object, Object>> entrySet= properties.entrySet();
        for (Map.Entry<Object,Object> entry:entrySet){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
