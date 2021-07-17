package interviewpreparation;

import java.io.*;
import java.util.Properties;

public class PropertyFileExample {
    public static void main(String[] args) {
        try{
            Properties properties= new Properties();
            properties.load(new FileInputStream(new File("C:\\Users\\maskepri\\Desktop\\test.properties")));
            System.out.println(properties.getProperty("name"));

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter Name ...");
            String name= br.readLine();
            System.out.println("Your Name : "+name);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
