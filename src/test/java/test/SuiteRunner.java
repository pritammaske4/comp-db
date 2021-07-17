package test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.TestNG;

import java.util.ArrayList;
import java.util.List;

public class SuiteRunner {
    public static void main(String[] args) {
        // Create object of TestNG Class
        TestNG runner=new TestNG();

        // Create a list of String
        List<String> suiteFiles=new ArrayList<String>();

        // Add xml file which you have to execute
        suiteFiles.add("path/to/suite/file/testng.xml");

        // now set xml file for execution
        runner.setTestSuites(suiteFiles);

        // finally execute the runner using run method
        runner.run();

    }
}
