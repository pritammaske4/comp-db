package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class TestProgram {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\maskepri\\Desktop\\driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        driver.findElement(By.tagName("body")).sendKeys(Keys.CONTROL+"t");

        String mainWindow=driver.getWindowHandle();

        Set<String> newWindow= driver.getWindowHandles();

        driver.switchTo().window((String) newWindow.toArray()[1]);
        driver.get("https://www.youtube.com/");

        for(String s : newWindow){
            System.out.println(s);

        }

        driver.switchTo().window(mainWindow);

    }
}
