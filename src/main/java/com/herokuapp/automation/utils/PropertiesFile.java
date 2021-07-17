package com.herokuapp.automation.utils;

import org.apache.log4j.Logger;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFile {
    public static final Logger logger = Logger.getLogger(PropertiesFile.class);

    public Properties getProperties(String fileName) {
        Properties properties = null;
        InputStream inputStream;
        try {
            properties = new Properties();
            inputStream = new FileInputStream(fileName);
            properties.load(inputStream);
        } catch (Exception e) {
            logger.trace(e);
        }
        return properties;
    }
}
