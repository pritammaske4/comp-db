package practice;

import org.omg.CORBA.TIMEOUT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class WebDriverWaitExample {
    public static void main(String[] args) {
        WebDriver driver = null;
        //Implicit
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

        //Explicit
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.withTimeout(30,TimeUnit.SECONDS);
        wait.pollingEvery(10,TimeUnit.SECONDS);
        wait.ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("")));

        //Fluent wait
        FluentWait fluentWait = new FluentWait(driver);
        fluentWait.withTimeout(30,TimeUnit.SECONDS);
        fluentWait.pollingEvery(10,TimeUnit.SECONDS);
        fluentWait.ignoring(NoSuchElementException.class);
        WebElement element = null;
        fluentWait.until(ExpectedConditions.elementToBeClickable(element));
        fluentWait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));


    }
}
