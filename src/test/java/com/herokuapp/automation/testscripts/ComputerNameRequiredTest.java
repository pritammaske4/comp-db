package com.herokuapp.automation.testscripts;

import com.herokuapp.automation.pages.ComputersPage;
import com.herokuapp.automation.pages.NewComputerPage;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComputerNameRequiredTest extends BaseTestScript{
    @Test(description = "Test Script to verify Computer Name Required Error Message",dataProvider = "compDBDataProvider")
    public void computerNameRequiredTest(String computerName,String introduceDate,String discontinuedDate,String company){
        ComputersPage.waitForSec(3);
        extentTest.log(LogStatus.INFO, "Computer Name :"+computerName);
        int count = ComputersPage.getCurrentComputerCount();
        extentTest.log(LogStatus.INFO, "Current Computer Count :"+count);
        ComputersPage.clickOnAddNewComputerButton();
        extentTest.log(LogStatus.INFO, "Navigating to New Computer Page");
        ComputersPage.waitForSec(2);
        NewComputerPage.enterComputerName(computerName);
        NewComputerPage.enterIntroducedDate(introduceDate);
        NewComputerPage.enterDiscontinuedDate(discontinuedDate);
        NewComputerPage.selectCompany(company);
        NewComputerPage.clickOnCreateNewComputer();
        Assert.assertEquals(NewComputerPage.isComputerNameErrorMsgVisible(),true,"Computer Name is Required Error message not displayed");
        extentTest.log(LogStatus.PASS, "Successfully verified Computer Name is Required Error Message");
        NewComputerPage.clickOnCancelButton();
        ComputersPage.waitForSec(2);
        Assert.assertEquals(ComputersPage.getCurrentComputerCount(),count,"Computer Count is mismatching");
        extentTest.log(LogStatus.PASS, "Successfully verified same Computer count : "+ComputersPage.getCurrentComputerCount());
    }
}
