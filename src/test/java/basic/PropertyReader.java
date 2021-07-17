package basic;

import java.io.*;
import java.util.Properties;


public class PropertyReader {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        InputStream in = new FileInputStream(new File("C:\\Users\\maskepri\\Desktop\\data.properties"));
        properties.load(in);

        for (int i=0;i<properties.keySet().size();i++){
            System.out.println(properties.keySet().toArray()[i].toString() +" : "+properties.values().toArray()[i].toString());
        }
    }
}
