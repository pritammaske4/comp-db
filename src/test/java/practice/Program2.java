package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Program2 {
    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub

        System.setProperty("webdriver.chrome.driver","src\\main\\resources\\drivers\\win\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.target.com/");

        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.id("account")).click();

        Thread.sleep(3000);
        driver.findElement(By.id("accountNav-signIn")).click();

        Thread.sleep(3000);
        driver.findElement(By.id("username")).sendKeys("pritammaske4@gmail.com");

        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("Maske@123456");

        Thread.sleep(1000);
        driver.findElement(By.id("login")).click();

//        WebElement searchfield = driver.findElement(By.name("q"));
//
//        searchfield.sendKeys("pluralsight");
//        searchfield.submit();
//
//
//        driver.navigate().refresh();
//        String st_name="";
//        WebElement imagesLink = driver.findElements(By.linkText("//input[@title='Jump to Detailed Analysis' and contains(@onclick,'"+st_name+"')]")).get(0);
//        imagesLink.click();
    }

    @Test
    public void test() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\win\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.de");

        if("".equals(null)){}
    }
}