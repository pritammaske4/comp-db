package com.herokuapp.automation.report;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {
    private static ExtentReports extentReports;

    public static synchronized ExtentReports getReporter() {
        if (extentReports == null) {
            extentReports = new ExtentReports("./ExtentReport.html", true);
            extentReports.addSystemInfo("Host Name", System.getenv("COMPUTERNAME")).addSystemInfo("Environment", "QA");
        }
        return extentReports;
    }
}
