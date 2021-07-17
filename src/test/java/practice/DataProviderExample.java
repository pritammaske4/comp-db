package practice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataProviderExample {

    @DataProvider
    public static Iterator<Object[]> myDataProvider(){
        Object myData [] = new Object[]{"Prakash","Patil"};

        List <Object[]>list =new ArrayList<>();
        list.add(myData);
         return list.iterator();
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method");

    }

    @Test(dataProvider = "myDataProvider")
    public void test(String name,String surname){
        System.out.println("Name : "+name +" Surname : "+surname);
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method");
    }
}


