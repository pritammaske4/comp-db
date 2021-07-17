package com.herokuapp.automation;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class InstanceStatic {
    public static void main(String[] args) {
        InstanceStatic instanceStatic = null;
        instanceStatic.display();
    }

    public static void display(){
        System.out.println("Hello");
        Properties properties;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter your name : ");
            String name=br.readLine();
            System.out.println("Your Name : "+name);
            properties = new Properties();
            InputStream in = new FileInputStream("C:\\Users\\maskepri\\Desktop\\test.properties");
            properties.load(in);
            System.out.println(properties.getProperty("name"));
        }catch (Exception e){

        }

    }
}
