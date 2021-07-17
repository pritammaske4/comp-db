package test;

import java.util.ArrayList;
import java.util.List;

public class MultiDimeList {

    public int add(List<List<Integer>>arr){
        int d1Sum=0;
        int d2Sum=0;

        for(int i=arr.size()-1,j=0;i>=0;i--,j++){
            d1Sum= d1Sum+arr.get(j).get(j);
            d2Sum=d2Sum+arr.get(i).get(j);
        }
        return Math.abs(d1Sum-d2Sum);
    }

    public static void main(String[] args) {

        List<List<Integer>> listOfList= new ArrayList<>();
        List <Integer> first= new ArrayList<>();
        first.add(1);
        first.add(2);
        first.add(12);

        List <Integer> second= new ArrayList<>();
        second.add(4);
        second.add(5);
        second.add(6);

        List <Integer> third= new ArrayList<>();
        third.add(7);
        third.add(8);
        third.add(9);

        listOfList.add(first);
        listOfList.add(second);
        listOfList.add(third);

        int add =new MultiDimeList().add(listOfList);
        System.out.println("diff :"+add);
        Integer i= new Integer(10);
        System.out.println("I"+i);

    }
}
