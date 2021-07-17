package practice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        System.out.println(System.getProperty("user.dir"));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        int rem=0;
        int sum=0;
        while (num>0){
            rem = rem*10 + num%10;
            sum =sum+num%10;
            num = num/10;
        }
        System.out.println("Rev : "+rem);
        System.out.println("Sum : "+sum);

    }

    public Map<String,String> getMap(List<Object[]> list, int index){
        Map <String,String> map = new HashMap<>();

        for (int i=0;i<list.get(0).length;i++){
            map.put(list.get(0)[i].toString(),list.get(index)[i].toString());
        }
        return map;
    }
}
