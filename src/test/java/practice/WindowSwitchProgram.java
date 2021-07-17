package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Set;

public class WindowSwitchProgram {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\win\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://seleniumpractise.blogspot.com/");

        driver.findElement(By.linkText("Multiple window examples")).click();
        String parentWindw = driver.getWindowHandle();

        ArrayList Titles = new ArrayList();

        driver.findElement(By.xpath("//*[@id='post-body-6170641642826198246']/a[1]")).click();

        Titles.add(driver.getTitle());

        driver.switchTo().window(parentWindw);

        driver.findElement(By.xpath("//*[@id=\"post-body-6170641642826198246\"]/a[2]")).click();
        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
        Titles.add(driver.getTitle());

        driver.switchTo().window(parentWindw);

        driver.findElement(By.xpath("//*[@id=\"post-body-6170641642826198246\"]/a[3]")).click();
        //System.out.println(driver.getTitle());
        driver.switchTo().window(driver.getWindowHandles().toArray()[2].toString());
        Titles.add(driver.getTitle());

        driver.switchTo().window(parentWindw);

        Set allWindwHandles = driver.getWindowHandles();
        int winCount = allWindwHandles.size();
        System.out.println(winCount);

        ArrayList tabs = new ArrayList(allWindwHandles);


        for (int j = 1; j < winCount; j++) {
            driver.switchTo().window(tabs.get(j).toString());
            System.out.println(driver.getTitle());
            System.out.println(Titles.get(j - 1));
        }
    }
}