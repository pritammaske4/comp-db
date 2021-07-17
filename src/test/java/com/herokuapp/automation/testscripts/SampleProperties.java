package com.herokuapp.automation.testscripts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class SampleProperties {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("C:\\Users\\maskepri\\Desktop\\test.properties");
        Properties props = new Properties();
        props.load(in);
        in.close();

        FileOutputStream out = new FileOutputStream("C:\\Users\\maskepri\\Desktop\\test.properties");
        props.setProperty("name", "#pritam");
        props.store(out, null);
        out.close();
    }
}
