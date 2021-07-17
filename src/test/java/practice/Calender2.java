package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Calender2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shahid\\eclipseworkspace\\InitialSeleniumProject\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.path2usa.com/travel-companions");
        driver.findElement(By.xpath("//*[@id='travel_from']")).sendKeys("Chicago");
        driver.findElement(By.xpath("//*[@id='Rockford']")).click();
        driver.findElement(By.xpath("//*[@id='travel_to']")).sendKeys("Dallas");
        driver.findElement(By.xpath("//*[@id='Dallas-Fort Worth']")).click();
        driver.findElement(By.xpath("//*[@id='travel_date']")).click();

        WebElement DateMonth=driver.findElement(By.xpath("//div[@class='datepicker- days']/table/thead/tr/th[2]"));
        WebElement datechanger=driver.findElement(By.xpath("//div[@class='datepicker- days']/table/thead/tr/th[3]"));
        List<WebElement> dates=driver.findElements(By.tagName("td"));
        while(!DateMonth.getText().contains("April")) {
            datechanger.click();
            for(int i=0;i<dates.size();i++) {
                if(driver.findElements(By.tagName("td")).get(i).getText().equalsIgnoreCase("23")) {
                    driver.findElements(By.tagName("td")).get(i).click();
                    break;
                }
            }
        }
    }

}
