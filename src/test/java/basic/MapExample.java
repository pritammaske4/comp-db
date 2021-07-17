package basic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map <String,String>map = null;
        try {
            map = new HashMap();
            map.put("Name","pritam");
            map.put("Age","29");
            map.put("class","SE");

//            for (int i=map.size()-1;i>=0;i--){
//                System.out.println(map.keySet().toArray()[i]+" : "+map.values().toArray()[i]);
//            }
//
//            for (String value:map.values()){
//                System.out.println("value : "+value);
//            }
//
//            for (String key : map.keySet()){
//                System.out.println("key :"+key);
//            }

            Iterator iterator = map.keySet().iterator();

            while (iterator.hasNext()){
                System.out.println("Keys : -- >"+iterator.next().toString());
                System.out.println("Values : -- >"+map.values().iterator().next());
            }
        }catch (Exception e){

        }
    }

}
