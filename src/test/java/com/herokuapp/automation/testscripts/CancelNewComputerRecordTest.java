package com.herokuapp.automation.testscripts;

import com.herokuapp.automation.pages.ComputersPage;
import com.herokuapp.automation.pages.NewComputerPage;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CancelNewComputerRecordTest extends BaseTestScript {
    @Test(description = "Test Script to cancel new computer record insertion",dataProvider = "compDBDataProvider")
    public void cancelComputerRecordTest(String computerName,String introduceDate,String discontinuedDate,String company){
        computerName = getRandomNumber()+"_"+computerName;
        extentTest.log(LogStatus.INFO, "Computer Name :"+computerName);
        ComputersPage.waitForSec(3);
        int count = ComputersPage.getCurrentComputerCount();
        extentTest.log(LogStatus.INFO, "Current Computer Count :"+count);
        ComputersPage.clickOnAddNewComputerButton();
        extentTest.log(LogStatus.INFO, "Navigating to New Computer Page");
        ComputersPage.waitForSec(2);
        NewComputerPage.enterComputerName(computerName);
        NewComputerPage.enterIntroducedDate(introduceDate);
        NewComputerPage.enterDiscontinuedDate(discontinuedDate);
        NewComputerPage.selectCompany(company);
        NewComputerPage.clickOnCancelButton();
        ComputersPage.waitForSec(2);

        Assert.assertEquals(ComputersPage.getCurrentComputerCount(),count,"Computer Count is mismatching");
        extentTest.log(LogStatus.PASS, "Successfully verified that new record is not added and verified same Computer count : "+ComputersPage.getCurrentComputerCount());

        ComputersPage.searchComputer(computerName);
        ComputersPage.waitForSec(1);
        Assert.assertEquals(ComputersPage.isHeaderNoComputerFoundVisible(),true,"Failed to check Header 'No Computers Found'");
        extentTest.log(LogStatus.PASS, "Successfully Checked Header 'No Computers Found'");
    }
}
