package com.herokuapp.automation.report;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.NetworkMode;
import org.testng.*;
import org.testng.xml.XmlSuite;

import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class ExtentReport {
    private ExtentReports extent;

    public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
        extent = new ExtentReports(outputDirectory + File.separator + "Extent.html", false, NetworkMode.OFFLINE);
        for (ISuite suite : suites) {
            Map<String, ISuiteResult> result = suite.getResults();
            for (ISuiteResult r : result.values()) {
                ITestContext context = r.getTestContext();
                buildTestNodes(context.getPassedTests(), LogStatus.PASS, context);
                buildTestNodes(context.getFailedTests(), LogStatus.FAIL, context);
                buildTestNodes(context.getSkippedTests(), LogStatus.SKIP, context);
            }
        }
        extent.flush();
        extent.close();
    }
    private void buildTestNodes(IResultMap tests, LogStatus status, ITestContext context) {
        ExtentTest test;
        if (tests.size() > 0) {
            int i = 0;
            for (ITestResult result : tests.getAllResults()) {
                String testScriptName = result.getTestClass().getName();
                test = extent.startTest(result.getTestClass().getName() + " : " + result.getMethod().getMethodName());
                test.setStartedTime(getTime(result.getStartMillis()));
                test.setEndedTime(getTime(result.getEndMillis()));
                test.log(status, "Test Case ID : " + result.getMethod().getDescription());
                test.log(status, result.getParameters().toString());

                for (String group : result.getMethod().getGroups())
                    test.assignCategory(group);
                if (result.getThrowable() != null) {
                    test.log(status, result.getThrowable());
                } else {
                    test.log(status, "Test " + status.toString().toLowerCase() + "ed");
                }
                if (status.equals(LogStatus.FAIL)) {
                    String image = test.addScreenCapture("screenshots/" + testScriptName.split("\\.")[testScriptName.split("\\.").length - 1] + "_" + result.getMethod().getMethodName());
                    test.log(status, "", image);
                }
                extent.endTest(test);
                i++;
            }
        }
    }
    private Date getTime(long millis) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        return calendar.getTime();
    }
}
