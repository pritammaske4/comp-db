package practice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Program3 {
    @Test
    public void getText1() throws InterruptedException {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/win/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/maskepri/Desktop/Doc.html");
        System.out.println(driver.findElement(By.xpath("//h5[@class='valheading ng-binding']")).getText());
        driver.findElement(By.tagName("html")).sendKeys(Keys.CONTROL,Keys.SUBTRACT);
        Thread.sleep(2000);
        driver.findElement(By.tagName("html")).sendKeys(Keys.CONTROL,Keys.SUBTRACT);
        Thread.sleep(2000);


        List<WebElement> options = driver.findElements(By.tagName("option")); // get all options

        for(int i=0;i<options.size();i++) { //loop for available options
            driver.findElements(By.tagName("option")).get(i).click();//select option
            driver.findElement(By.xpath("XPATH_OF_Search_Button")); // click on Search button
        }

    }
}
