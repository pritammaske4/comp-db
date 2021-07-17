package com.herokuapp.automation.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class FacebookTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/win/chromedriver.exe");

        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values.notifications", 2);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("pritammaske4@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("Maske@954585");
        driver.findElement(By.id("loginbutton")).click();
    }
}
