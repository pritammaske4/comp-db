package com.herokuapp.automation.testscripts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Example {

    public static void main(String[] args) throws IOException {
        String line;
        try {
            Process proc = Runtime.getRuntime().exec("wmic.exe");
            BufferedReader input = new BufferedReader(new InputStreamReader(proc.getInputStream()));
            OutputStreamWriter oStream = new OutputStreamWriter(proc.getOutputStream());
            oStream.write("process where name='chrome.exe'");
            oStream.flush();
            oStream.close();
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
            input.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public void closeAllFirefoxInstances(){
        try {
            Runtime.getRuntime().exec("TASKKILL /F /IM firefox.exe");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean isFirefoxRunning(){
        boolean flag = false;
        try {
            Process proc = Runtime.getRuntime().exec("wmic.exe");
            BufferedReader input = new BufferedReader(new InputStreamReader(proc.getInputStream()));
            OutputStreamWriter oStream = new OutputStreamWriter(proc.getOutputStream());
            oStream.write("process where name='firefox.exe'");
            oStream.flush();
            oStream.close();
            while ( input.readLine() != null) {
                flag= true;
                break;
            }
            input.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return flag;
    }
}
