package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src\\main\\resources\\drivers\\win\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.safetysign.com/products/7337/ez-pipe-marker");

        Thread.sleep(5000);
        driver.findElement(By.xpath("//p[text()='Page']//..//following-sibling::button")).click();
    }


}
