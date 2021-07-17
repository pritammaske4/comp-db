package com.herokuapp.automation.utils;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class GuiControl {
    public static final Logger logger = Logger.getLogger(GuiControl.class);

    private WebElement webElement;
    private List<WebElement> webElementList;
    private static WebDriver webDriver;
    private String locatorType;
    private String locatorValue;

    public GuiControl(String locator) {
        locatorType = locator.split("_TBD_")[0];
        locatorValue = locator.split("_TBD_")[1];
    }

    public WebElement getWebElement() {
        return getWebElement(locatorType, locatorValue);
    }

    public WebElement getWebElement(String locatorType, String locatorValue) {

        switch (locatorType.toUpperCase()) {
            case "ID":
                webElement = webDriver.findElement(By.id(locatorValue));
                break;
            case "NAME":
                webElement = webDriver.findElement(By.name(locatorValue));
                break;
            case "CLASSNAME":
                webElement = webDriver.findElement(By.className(locatorValue));
                break;
            case "TAGNAME":
                webElement = webDriver.findElement(By.tagName(locatorValue));
                break;
            case "XPATH":
                webElement = webDriver.findElement(By.xpath(locatorValue));
                break;
            case "LINKTEXT":
                webElement = webDriver.findElement(By.linkText(locatorValue));
                break;
            case "PARTIALLINKTEXT":
                webElement = webDriver.findElement(By.partialLinkText(locatorValue));
                break;
            default:
                logger.info("Locator type is not present");
        }
        return webElement;
    }

    public List<WebElement> getGuiControlChild(String locatorType, String locatorValue) {

        switch (locatorType.toUpperCase()) {
            case "ID":
                webElementList = webDriver.findElements(By.id(locatorValue));
                break;
            case "NAME":
                webElementList = webDriver.findElements(By.name(locatorValue));
                break;
            case "CLASSNAME":
                webElementList = webDriver.findElements(By.className(locatorValue));
                break;
            case "XPATH":
                webElementList = webDriver.findElements(By.xpath(locatorValue));
                break;
            case "TAGNAME":
                webElement = webDriver.findElement(By.tagName(locatorValue));
                break;
            case "LINKTEXT":
                webElement = webDriver.findElement(By.linkText(locatorValue));
                break;
            case "PARTIALLINKTEXT":
                webElement = webDriver.findElement(By.partialLinkText(locatorValue));
                break;
            default:
                logger.info("Locator type is not present");
        }
        return webElementList;
    }

    public void click() {
        getWebElement().click();
    }

    public String getAttribute(String attributeName) {
        return getWebElement().getAttribute(attributeName);
    }

    public void sendKeys(String keys) {
        getWebElement().sendKeys(keys);
    }

    public static WebDriver getWebDriver() {
        return webDriver;
    }

    public static void setWebDriver(String browserName) {
        switch (browserName.toUpperCase()) {
            case "CHROME":
                System.setProperty("webdriver.chrome.driver", getDriverPath(browserName.toLowerCase()));
                webDriver = new ChromeDriver();
                break;
            default:
                logger.info("Locator type is not present");
        }
    }

    public static String getDriverPath(String browserName) {
        String driverPath = "src/main/resources/drivers/";
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("win")) {
            driverPath = driverPath + "win/" + browserName + "driver.exe";
        }
        return driverPath;
    }

    public void selectByVisibleText(String visibleText) {
        new Select(getWebElement()).selectByVisibleText(visibleText);
    }

    public String getText() {
        return getWebElement().getText();
    }

    public void clear(){
        getWebElement().clear();
    }

    public boolean isVisible() {
        return getWebElement().isDisplayed();
    }
}
