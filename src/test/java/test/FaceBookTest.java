package test;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class FaceBookTest {
    @Test
    public void loginFacebook() throws AWTException {
        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/win/chromedriver.exe");
        ChromeDriverService service = new ChromeDriverService.Builder().withWhitelistedIps("").withVerbose(true).build();
        WebDriver driver = new ChromeDriver(service);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.COMMAND, "r"));

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_WINDOWS);



        WebElement element = driver.findElement(By.tagName("input"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click()",element);


    }
}
