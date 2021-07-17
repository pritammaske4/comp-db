package com.herokuapp.automation.testscripts;

import com.herokuapp.automation.pages.ComputersPage;
import com.herokuapp.automation.pages.NewComputerPage;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UpdateExistingComputerRecordIntroducedDate extends BaseTestScript {

    @Test(description = "Test Script to update existing computer record with Introduced Date",dataProvider = "compDBDataProvider")
    public void updateComputerTest(String computerName,String introduceDate,String discontinuedDate,String company,String updateIntroducedDate) {
        computerName = getRandomNumber() + "_" + computerName;
        extentTest.log(LogStatus.INFO, "Computer Name :" + computerName);
        ComputersPage.waitForSec(3);
        int count = ComputersPage.getCurrentComputerCount();
        extentTest.log(LogStatus.INFO, "Current Computer Count :" + count);
        ComputersPage.clickOnAddNewComputerButton();
        extentTest.log(LogStatus.INFO, "Navigating to New Computer Page");
        ComputersPage.waitForSec(2);
        NewComputerPage.enterComputerName(computerName);
        NewComputerPage.enterIntroducedDate(introduceDate);
        NewComputerPage.enterDiscontinuedDate(discontinuedDate);
        NewComputerPage.selectCompany(company);
        NewComputerPage.clickOnCreateNewComputer();

        Assert.assertEquals(ComputersPage.verifyCreateSuccessMsg(computerName), true, "Failed to verify success Messagwe");
        extentTest.log(LogStatus.PASS, "Successfully Added new computer");
        ComputersPage.waitForSec(3);

        Assert.assertEquals(ComputersPage.verifyTotalComputerCountAfterAddition(count), true, "Failed to verify paging index count after adding the computer");
        extentTest.log(LogStatus.PASS, "Successfully verified increased Computer count after new record insertion : " + ComputersPage.getCurrentComputerCount());

        ComputersPage.searchComputer(computerName);
        Assert.assertEquals(ComputersPage.isNewRecordAdded(computerName, company), true, "Failed to validate is new record added");
        extentTest.log(LogStatus.PASS, "Successfully validated new record creation");

        ComputersPage.openComputerRecord(computerName,company);
        ComputersPage.waitForSec(2);

        NewComputerPage.updateIntroducedDate(updateIntroducedDate);
        NewComputerPage.clickOnSaveButton();

        Assert.assertEquals(ComputersPage.verifyUpdateSuccessMsg(computerName), true, "Failed to verify update Message");
        extentTest.log(LogStatus.PASS, "Successfully Updated computer record");
        ComputersPage.waitForSec(3);

        ComputersPage.searchComputer(computerName);
        Assert.assertEquals(ComputersPage.isNewRecordAdded(computerName, company), true, "Failed to validate is new record added");
        extentTest.log(LogStatus.PASS, "Successfully validated new record creation");

        ComputersPage.openComputerRecord(computerName,company);
        ComputersPage.waitForSec(5);

        Assert.assertEquals(NewComputerPage.verifyIntroduceDate(updateIntroducedDate),true,"Failed to validate updated Introduced Date");
        extentTest.log(LogStatus.PASS, "Successfully validated Updated Introduced Date");
    }
}
