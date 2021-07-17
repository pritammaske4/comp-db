package practice;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class FileRead {

    public static void main(String[] args) {
        System.out.println(new FileRead().readProperties("C:\\Users\\maskepri\\Desktop\\data.properties").getProperty("name"));
    }


    public Properties readProperties(String fileName){
        Properties properties=null;
        try {
            properties = new Properties();
            properties.load(new FileInputStream(fileName));
        }
        catch(Exception ex){

        }
        return properties;
    }
}
