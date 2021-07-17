package basic;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        Map map1 = new HashMap();

        Map <String,String>map = new HashMap();

        map.put("A","1");
        map.put("B","2");

        Iterator it = map.keySet().iterator();
        Iterator itt= map.values().iterator();

        while (it.hasNext() & itt.hasNext()){
            System.out.println("Key : "+it.next() +" Value : "+itt.next());
        }

        for (int i=0;i<map.keySet().size();i++){
            System.out.println(map.keySet().toArray()[i] +" : "+map.values().toArray()[i]);

        }

        Collection <String>collection = map.values();
        Set <String>set = map.keySet();
    }
}
