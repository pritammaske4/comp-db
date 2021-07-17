package com.herokuapp.automation.utils;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class CompDBScreenshot {
    public static final Logger logger = Logger.getLogger(CompDBScreenshot.class);

    public static void takeScreenshot(String fileName) {
        logger.info("Inside takeScreenshot method");
        try {
            File screenshot = ((TakesScreenshot) GuiControl.getWebDriver()).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshot, new File("screenshots/" + fileName));
        } catch (IOException e) {
            logger.trace(e.getMessage());
        }
    }
}
