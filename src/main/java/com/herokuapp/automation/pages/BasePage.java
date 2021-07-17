package com.herokuapp.automation.pages;

import com.herokuapp.automation.utils.XmlFile;
import org.apache.log4j.Logger;

import java.util.Map;
import java.util.regex.Pattern;

public class BasePage {
    public static final Logger logger = Logger.getLogger(BasePage.class);
    static Map<String, String> elementRepoMap;
    static String oldFileName = "";

    public static final Map<String, String> getElementMap() {
        String fileName = Thread.currentThread().getStackTrace()[2].getFileName().split(Pattern.quote("."))[0];
        if (elementRepoMap != null && fileName.equals(oldFileName))
            return elementRepoMap;
        oldFileName = fileName;
        elementRepoMap = new XmlFile().getElementRepoMap(fileName);
        return elementRepoMap;
    }
    public static void waitForSec(long time) {
        try {
            Thread.sleep(time * 1000);
        } catch (InterruptedException e) {
            logger.trace(e);
            Thread.currentThread().interrupt();
        }
    }
}
