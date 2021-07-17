package com.herokuapp.automation.testscripts;

import com.herokuapp.automation.pages.ComputersPage;
import com.herokuapp.automation.pages.NewComputerPage;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteComputerRecordTest extends BaseTestScript {

    @Test(description = "Test Script to Delete Computer record",dataProvider = "compDBDataProvider")
    public void deleteComputerTest(String computerName,String introduceDate,String discontinuedDate,String company){

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
        ComputersPage.openComputerRecord(computerName,company);
        ComputersPage.waitForSec(3);

        NewComputerPage.clickOnDeleteButton();
        ComputersPage.waitForSec(2);

        Assert.assertEquals(ComputersPage.verifyDeleteSuccessMsg(),true,"Failed to verify Delete success Message");
        extentTest.log(LogStatus.PASS, "Successfully verified Delete computer Message");

        ComputersPage.searchComputer(computerName);
        ComputersPage.waitForSec(1);
        Assert.assertEquals(ComputersPage.isHeaderNoComputerFoundVisible(),true,"Failed to check Header 'No Computers Found'");
        extentTest.log(LogStatus.PASS, "Successfully Checked Header 'No Computers Found'");
    }
}
