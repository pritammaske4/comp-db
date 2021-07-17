package com.herokuapp.automation.testscripts;

public class DuplicateChar {
    public static void main(String[] args) {
        String s = "surajjogdand";
        char c [] = s.toCharArray();
        for (int i=0;i<c.length;i++){

            if (c[i]==c[i+1]){
                System.out.println("First Duplicate char is "+c[i]);
                break;
            }
        }
    }
}
