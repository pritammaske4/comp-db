package com.herokuapp.automation.testscripts;

import com.herokuapp.automation.report.ExtentManager;
import com.herokuapp.automation.utils.BrowserDriver;
import com.herokuapp.automation.utils.CompDBDataProvider;
import com.herokuapp.automation.utils.CompDBScreenshot;
import com.herokuapp.automation.utils.PropertiesFile;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.Logger;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Properties;
import java.util.Random;

public class BaseTestScript {

    private static final Logger logger = Logger.getLogger(BaseTestScript.class);
    public static Properties configProperty = null;
    public static ExtentReports extentReport;
    public static ExtentTest extentTest;

    @DataProvider(name = "compDBDataProvider")
    public Iterator<Object[]> data() {
        try {
            return new CompDBDataProvider().getData(this.getClass().getSimpleName());
        } catch (Exception ex) {
            logger.info(ex);
        }
        return null;
    }

    @BeforeSuite
    public static void beforeSuite() {
        configProperty = new PropertiesFile().getProperties("config.properties");
    }

    @BeforeTest
    public void beforeTest() {
        logger.info("Inside Before Test Method ");
    }

    @BeforeClass
    public static void beforeClass() {
        try {
            logger.info("Inside beforeClass Method");
            extentReport = ExtentManager.getReporter();
            BrowserDriver.startBrowser(configProperty.getProperty("browserName"));
            BrowserDriver.maximizeBrowser();
            BrowserDriver.accessUrl(configProperty.getProperty("url"));
        } catch (Exception ex) {
            logger.info(ex);
        }
    }

    @BeforeMethod
    public void beforeMethod(Method method) {
        logger.info("Inside Before Method ");
        extentTest = extentReport.startTest(this.getClass().getSimpleName() + " : " + method.getName());
        extentTest.log(LogStatus.INFO, "Description : " + method.getAnnotation(Test.class).description());
    }

    @AfterMethod
    public void afterMethod(ITestResult result) {
        logger.info("Inside After Method ");
        if (result.getStatus() == ITestResult.FAILURE) {
            CompDBScreenshot.takeScreenshot(this.getClass().getSimpleName() + "_" + result.getMethod().getMethodName()+".png");
            logger.info("Captured the screenshot for  Test script : " + this.getClass().getSimpleName() + ", Method Name : " + result.getMethod().getMethodName());
            extentTest.log(LogStatus.FAIL, "" + result.getThrowable());
            extentTest.log(LogStatus.FAIL, "Snapshot below: " + extentTest.addScreenCapture("screenshots/" + this.getClass().getSimpleName() + "_" + result.getMethod().getMethodName()+".png"));
        }
        extentReport.endTest(extentTest);
    }

    @AfterClass(alwaysRun = true)
    public void afterClass() {
        try {
            logger.info("Inside afterClass Method");
            BrowserDriver.stopBrowser();
        } catch (Exception ex) {
            logger.info(ex);
        }
        extentReport.flush();
    }

    @AfterTest
    public void afterTest() {
        BrowserDriver.stopBrowser();
    }

    public int getRandomNumber(){
        Random rand = new Random();
        return rand.nextInt(999) + 1;
    }
}
