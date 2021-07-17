package com.herokuapp.automation.testscripts;

public class SubString1 {
    public static void main(String[] args) {
        String s="hunhun hundred hungry hen ran behind hundred pigeon with speed of hundred milli per seconds like hunters hunhun";
        String f = "hun";
        String []myArray=s.split(" ");
        int counter =0;
        for (int i=0;i<myArray.length;i++){
            if(myArray[i].contains(f)){
                counter++;
            }
        }

        System.out.println("Counter :"+counter);
    }
}
