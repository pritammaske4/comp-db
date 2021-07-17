package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Data {
    public static void main(String[] args) {
        Integer i=10;
        System.out.println(i.toString());
        WebDriver driver=null;
        driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.COMMAND, "a"));
    }
}
