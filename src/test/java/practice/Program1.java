package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Program1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src\\main\\resources\\drivers\\win\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.hindawi.com/journals/ecam/contents/");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("a[href='/journals/ecam/2019/']")).click();




    }
}
