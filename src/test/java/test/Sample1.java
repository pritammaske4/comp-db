package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src\\main\\resources\\drivers\\win\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.ia.ca/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"nav-secondaire\"]/div[1]/ul/li[4]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"nav-secondaire\"]/div[1]/ul/li[4]/ul/li[1]/section/ul/li[1]/a")).click();
        Thread.sleep(5000);
        //DropDown code
        WebElement selectMyElement =driver.findElement(By.xpath("//select[contains(@id,'bta-select-nos-calculateurs-')]"));
        Thread.sleep(3000);
        selectMyElement.click();
        Select cal = new Select(selectMyElement);
        cal.selectByIndex(1);
    }
}
