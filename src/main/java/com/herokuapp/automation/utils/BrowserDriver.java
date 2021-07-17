package com.herokuapp.automation.utils;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class BrowserDriver {
    public static void startBrowser(String browserName) {
        GuiControl.setWebDriver(browserName);
    }

    public static void maximizeBrowser() {
        GuiControl.getWebDriver().manage().window().maximize();
    }

    public static void accessUrl(String url) {
        GuiControl.getWebDriver().get(url);
    }

    public static void stopBrowser() {
        GuiControl.getWebDriver().quit();
    }

    public static WebDriver getWebDriver(){
        GuiControl.getWebDriver().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        return GuiControl.getWebDriver();
    }
}
