package com.herokuapp.automation.testscripts;

public class PrintCommonElements {
    public static void main(String[] args) {
        int num1[]= {1,2,3,3};
        int num2[]={4,5,1};
        int outerSize;
        int innerSize;
        if (num1.length>num2.length){

        }

        for (int i=0;i<num1.length;i++){
            for (int j=0;j<num2.length;j++) {
                if (num1[i] == num2[j]) {
                    System.out.println(num1[i]);
                }
            }
        }
    }

}
