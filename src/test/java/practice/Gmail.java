package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.reporters.TestHTMLReporter;

public class Gmail {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src\\main\\resources\\drivers\\win\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signin");

    }
}
