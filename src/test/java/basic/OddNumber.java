package basic;

import java.util.ArrayList;
import java.util.List;

public class OddNumber {
    public static void main(String[] args) {
        List list =new OddNumber().oddNumbers(4,15);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }

    public List<Integer> oddNumbers(int l, int r){
        List<Integer> list = new ArrayList<>();
        int num=l+1;
        if(num%2==0){
            num++;
        }
        for (int i=num;i<r;i=i+2){
            list.add(i);
        }
        return list;
    }
}
