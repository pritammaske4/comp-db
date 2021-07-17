package practice;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ScreenShotExample {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\maskepri\\Desktop\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/maskepri/Desktop/Doc.html");
//        driver.get("https://www.toolsqa.com/selenium-webdriver/switch-commands/");
        Thread.sleep(5000);

//        TakesScreenshot ts =(TakesScreenshot) driver;
//        File src =ts.getScreenshotAs(OutputType.FILE);
//        File screenshot = new File("C:\\Users\\maskepri\\Desktop\\driver\\ScreenSot.png");
//        FileUtils.copyFile(src,screenshot);
//
//        WebDriverWait wait =new WebDriverWait(driver,10);
//
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[normalize-space()='Payment Method']//following-sibling::div")));
//        driver.findElement(By.xpath("//label[normalize-space()='Payment Method']//following-sibling::div")).click();
//
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='PaymentMethod']//div[@id='footerAction']")));
//        List<WebElement>options= driver.findElements(By.xpath("//div[@id='PaymentMethod']//div[@id='footerAction']"));
//
//        for (WebElement option : options){
//            if (option.getText().equals("Cheque")){
//                option.click();
//                break;
//            }
//        }
driver.findElement(By.xpath("")).sendKeys("");
        System.out.println();

    }
}
