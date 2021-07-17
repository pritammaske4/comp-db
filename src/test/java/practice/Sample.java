package practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src\\main\\resources\\drivers\\win\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/maskepri/Desktop/Doc.html");
        driver.manage().window().maximize();
        Thread.sleep(10000);

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
        String textContent =javascriptExecutor.executeScript("return  document.getElementsByClassName('valheading ng-binding')[0].textContent").toString();
        System.out.println(textContent);
    }

}
