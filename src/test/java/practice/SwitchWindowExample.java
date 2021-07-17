package practice;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class SwitchWindowExample {

    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\maskepri\\Desktop\\driver\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://timesofindia.indiatimes.com/");


        TakesScreenshot ts = (TakesScreenshot)driver;
       File src = ts.getScreenshotAs(OutputType.FILE);
       FileUtils.copyFile(src,new File("C:\\Users\\maskepri\\Desktop\\driver\\Times.png"));
    }

}
