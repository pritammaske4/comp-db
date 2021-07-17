package com.herokuapp.automation.utils;

import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CompDBDataProvider {
    public static final Logger logger = Logger.getLogger(CompDBDataProvider.class);

    public Iterator<Object[]> getData(String fileName) {
        String[] data;
        String line;
        BufferedReader br = null;
        FileReader fileReader = null;
        List<Object[]> testData = new ArrayList<>();
        try {
            fileReader= new FileReader("src/test/resources/testdata/" + fileName + ".csv");
            br = new BufferedReader(fileReader);
            while ((line = br.readLine()) != null) {
                data = line.split("\\s*,\\s*");
                data = Arrays.copyOfRange(data, 0, data.length);
                for (int i = 0; i < data.length; i++) {
                    if (data[i].contains("^")) {
                        data[i] = data[i].replace("^", ",");
                    }
                }
                testData.add(data);
            }
        } catch (IOException e) {
            logger.info(e);
        } finally {
            try {
                if (fileReader!=null)
                    fileReader.close();
                if (br != null) br.close();
            } catch (IOException e) {
                logger.info(e);
            }
        }
        return testData.iterator();
    }
}
