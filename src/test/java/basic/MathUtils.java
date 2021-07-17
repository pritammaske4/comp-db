package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MathUtils {

    public static BigInteger factorial(int number) {
        BigInteger f = new BigInteger("1");
        for (int i = 2; i <= number; i++) {
            f = f.multiply(BigInteger.valueOf(i));
        }
        return f;
    }

    public static void foo(Object o) {
        System.out.println("Object impl");
    }
    public static void foo(String s) {
        System.out.println("String impl");

        long longWithL = 1000*60*60*24*365L;
        long longWithoutL = 1000*60*60*24*365;
        System.out.println(longWithL);
        System.out.println(longWithoutL);
    }

    public static void main(String[] args) {
        //System.out.println(factorial(3));
        //foo(null);
//        System.out.println('a'+0);
//        WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().pageLoadTimeout(70,TimeUnit.SECONDS).setScriptTimeout(10,TimeUnit.SECONDS).implicitlyWait(70,TimeUnit.SECONDS);

        String s = "strawberries";
        s= s.substring(0,5);
        System.out.println(s);
        System.out.println("   ".compareTo("  "));

//        int a = 123451234512345;
  //      System.out.println(a);
List names= new ArrayList();
        Collections.sort(names);
//        names.sort(List);
//
//
// names.stream().sorted((s1,s2)->s1.)

        List list = new ArrayList();
             list.add("hello");
            list.add(2);
            System.out.print(list.get(0) instanceof Object);
             System.out.print(list.get(1) instanceof Integer);
        System.out.println();
        System.out.println("A" instanceof String );
        System.exit(0);
    }
}
