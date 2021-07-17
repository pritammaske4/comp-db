package oops;

import java.util.ArrayList;
import java.util.List;

public class Overloading {

    public static void main(String[] args) {
        Overloading overloading= new Overloading();
        overloading.display(null);
    }

    public  void display(String s ){
        System.out.println("Called String");
    }

//    public void display(Overloading overloading){
//        System.out.println("Object method");
//    }

    public void display(Object obj){
        System.out.println("Called Object");
    }
}



