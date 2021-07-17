package com.herokuapp.automation.testscripts;

import com.herokuapp.automation.pages.ComputersPage;
import com.herokuapp.automation.pages.NewComputerPage;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddNewComputerTest extends BaseTestScript{

    @Test(description = "Test Script to create new computer record",dataProvider = "compDBDataProvider")
    public void newComputerTest(String computerName,String introduceDate,String discontinuedDate,String company){
        computerName=getRandomNumber()+"_"+computerName;
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
        NewComputerPage.clickOnCreateNewComputer();

        Assert.assertEquals(ComputersPage.verifyCreateSuccessMsg(computerName),true,"Failed to verify success Messagwe");
        extentTest.log(LogStatus.PASS, "Successfully Added new computer");
        ComputersPage.waitForSec(3);

        Assert.assertEquals(ComputersPage.verifyTotalComputerCountAfterAddition(count),true,"Failed to verify paging index count after adding the computer");
        extentTest.log(LogStatus.PASS, "Successfully verified increased Computer count after new record insertion : "+ComputersPage.getCurrentComputerCount());

        ComputersPage.searchComputer(computerName);
        Assert.assertEquals(ComputersPage.isNewRecordAdded(computerName,company),true,"Failed to validate is new record added");
        extentTest.log(LogStatus.PASS, "Successfully validated new record creation");
    }
}
