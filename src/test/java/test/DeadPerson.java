package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DeadPerson {

    public void display(float f){
        System.out.println("Inside Float");
    }
    public static void main(String[] args) {
        String names[]= new String[]{"Pritam","Raj","Ajinkya","Vishal","(x)Prakash"};

        Pattern pattern = Pattern.compile("^\\(x\\).*");
        Matcher matcher;

        System.out.println("Living Persons : ");
        for (int i=0;i<5;i++){
            matcher=pattern.matcher(names[i]);
            if(!matcher.find()){
                System.out.println(names[i]);
            }
        }

        new DeadPerson().display(1);
    }


    public void add(int[] ar){
        for (int i=0;i<ar.length;i++){

        }
    }
}
