package com.herokuapp.automation.pages;

import com.herokuapp.automation.utils.GuiControl;
import org.apache.log4j.Logger;

public class NewComputerPage extends  BasePage{

    public static final Logger logger = Logger.getLogger(NewComputerPage.class);

    public static final GuiControl txtComputerName = new GuiControl(getElementMap().get("txtComputerName"));
    public static final GuiControl txtIntroducedDate = new GuiControl(getElementMap().get("txtIntroducedDate"));
    public static final GuiControl txtDiscontinuedDate = new GuiControl(getElementMap().get("txtDiscontinuedDate"));
    public static final GuiControl selCompany = new GuiControl(getElementMap().get("selCompany"));
    public static final GuiControl btnCreateNewComputer = new GuiControl(getElementMap().get("btnCreateNewComputer"));
    public static final GuiControl btnCancel = new GuiControl(getElementMap().get("btnCancel"));
    public static final GuiControl btnDelete = new GuiControl(getElementMap().get("btnDelete"));
    public static final GuiControl btnSave = new GuiControl(getElementMap().get("btnSave"));
    public static final GuiControl lblComputerNameErrorMsg = new GuiControl(getElementMap().get("lblComputerNameErrorMsg"));
    public static final GuiControl lblIntroduceDateErrorMsg = new GuiControl(getElementMap().get("lblIntroduceDateErrorMsg"));
    public static final GuiControl lblDiscontinueDateErrorMsg = new GuiControl(getElementMap().get("lblIntroduceDateErrorMsg"));

    public static void enterComputerName(String computerName){
        txtComputerName.sendKeys(computerName);
    }

    public static void enterIntroducedDate(String introducedDate){
        txtIntroducedDate.sendKeys(introducedDate);
    }

    public static void enterDiscontinuedDate(String discontinuedDate){
        txtDiscontinuedDate.sendKeys(discontinuedDate);
    }

    public static void selectCompany(String companyName){
        selCompany.selectByVisibleText(companyName);
    }

    public static void clickOnCreateNewComputer(){
        btnCreateNewComputer.click();
    }

    public static void clickOnCancelButton(){
        btnCancel.click();
    }

    public static void clickOnDeleteButton(){
        btnDelete.click();
    }

    public static void clickOnSaveButton(){
        btnSave.click();
    }

    public static boolean isComputerNameErrorMsgVisible(){
        return lblComputerNameErrorMsg.isVisible();
    }

    public static boolean isIntroduceDateFormatErrorMsgVisible(){
        return lblIntroduceDateErrorMsg.isVisible();
    }

    public static boolean isDiscontinueDateFormatErrorMsgVisible(){
        return lblDiscontinueDateErrorMsg.isVisible();
    }

    public static boolean verifyComputerName(String computerName){
        return txtComputerName.getAttribute("value").equals(computerName);
    }

    public static boolean verifyIntroduceDate(String introduceDate){
        return txtIntroducedDate.getAttribute("value").equals(introduceDate);
    }

    public static boolean verifyDiscontinuedDate(String disContinuedDate){
        return txtDiscontinuedDate.getAttribute("value").equals(disContinuedDate);
    }
    public static boolean verifyCompany(String company){
        return selCompany.getAttribute("value").equals(company);
    }

    public static void updateDiscontinueDate(String disContinuedDate){
        txtDiscontinuedDate.clear();
        txtDiscontinuedDate.sendKeys(disContinuedDate);
    }
    public static void updateComputerName(String computerName){
        txtComputerName.clear();
        txtComputerName.sendKeys(computerName);
    }
    public static void updateIntroducedDate(String introducedDate){
        txtIntroducedDate.clear();
        txtIntroducedDate.sendKeys(introducedDate);
    }
    public static void updateCompany(String company){
        //selCompany.clear();
        selCompany.selectByVisibleText(company);
    }
}
