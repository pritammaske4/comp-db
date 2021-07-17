package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class ArraySorting {
    public static void main(String[] args) {
        String reverse=recursiveMethod("pritam");
        System.out.println(reverse);
        int myArray[];
        int temp;
        myArray= new int[]{12, 4, 45, 6, 2, 43, 6};

        for (int i=0;i<myArray.length;i++){
            for (int j=i+1;j<myArray.length;j++){
                if (myArray[i]>myArray[j]){
                 temp= myArray[i];
                 myArray[i]=myArray[j];
                 myArray[j]=temp;
                }
            }
        }

        for (int i=0;i<myArray.length;i++){
            System.out.println(myArray[i]);
        }

//        WebDriver driver=null;
//        driver=driver.switchTo().frame("");
//        Alert alert=driver.switchTo().alert();

    }

    static String recursiveMethod(String str)
    {
        if ((null == str) || (str.length() <= 1))
        {
            return str;
        }

        return recursiveMethod(str.substring(1)) + str.charAt(0);
    }
}
