package com.herokuapp.automation.pages;

import com.herokuapp.automation.utils.BrowserDriver;
import com.herokuapp.automation.utils.GuiControl;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ComputersPage extends BasePage {

    public static final Logger logger = Logger.getLogger(ComputersPage.class);

    public static final GuiControl btnFilterByName = new GuiControl(getElementMap().get("btnFilterByName"));
    public static final GuiControl btnAddNewComputer = new GuiControl(getElementMap().get("btnAddNewComputer"));
    public static final GuiControl txtSearchBox = new GuiControl(getElementMap().get("txtSearchBox"));
    public static final GuiControl lblSuccessMsg = new GuiControl(getElementMap().get("lblSuccessMsg"));
    public static final GuiControl lblpagingIndex = new GuiControl(getElementMap().get("lblpagingIndex"));
    public static final GuiControl headerNoComputerFound = new GuiControl(getElementMap().get("headerNoComputerFound"));

    public static void clickOnAddNewComputerButton(){
        btnAddNewComputer.click();
    }

    public static void clickOnFilterByNameButton(){
        btnFilterByName.click();
    }

    public static void enterComputerName(String computerName){
        txtSearchBox.sendKeys(computerName);
    }

    public static void searchComputer(String computerName){
        enterComputerName(computerName);
        clickOnFilterByNameButton();
    }

    public static boolean verifyCreateSuccessMsg(String computerName){
        String msg=lblSuccessMsg.getText();
        if (msg.equals("Done! Computer "+computerName+" has been created")){
            logger.info(msg);
            return true;
        }else {
            logger.error(msg);
            return false;
        }
    }

    public static boolean verifyDeleteSuccessMsg(){
        String msg=lblSuccessMsg.getText();
        if (msg.contains("Done! Computer has been deleted")){
            logger.info(msg);
            return true;
        }else {
            logger.error(msg);
            return false;
        }
    }

    public static boolean verifyUpdateSuccessMsg(String computerName){
        String msg=lblSuccessMsg.getText();
        if (msg.contains("Done! Computer "+computerName+" has been updated")){
            logger.info(msg);
            return true;
        }else {
            logger.error(msg);
            return false;
        }
    }

    public static int getCurrentComputerCount(){
        String pagingIndex = lblpagingIndex.getText();
        pagingIndex = pagingIndex.split("of ")[1].toString();
        return Integer.parseInt(pagingIndex);
    }

    public static boolean verifyTotalComputerCountAfterAddition(int earlierPagingIndex){
        earlierPagingIndex = earlierPagingIndex+1;
        int pagingIndex = getCurrentComputerCount();
        if(pagingIndex==earlierPagingIndex){
            logger.info(earlierPagingIndex+"and"+pagingIndex+"matches successfully after addition");
            return true;
        }else {
            logger.error(earlierPagingIndex+"and"+pagingIndex+"matches successfully after addition");
            return false;
        }
    }

    public static void openComputerRecord(String computerName,String companyName){
        WebElement table=GuiControl.getWebDriver().findElement(By.xpath("//table[contains(@class,'computers')]"));
        for (WebElement tableRow : table.findElements(By.tagName("tr"))){
            for (int i=1;i<=tableRow.findElements(By.tagName("td")).size();i++){
                if (tableRow.findElements(By.tagName("td")).get(0).getText().equals(computerName) &&tableRow.findElements(By.tagName("td")).get(3).getText().equals(companyName)){
                    tableRow.findElements(By.tagName("td")).get(0).findElement(By.tagName("a")).click();
                    break;
                }
            }
        }
    }

    public static boolean isNewRecordAdded(String computerName,String companyName){
        boolean result = false;
        WebElement table=GuiControl.getWebDriver().findElement(By.xpath("//table[contains(@class,'computers')]"));
        for (WebElement tableRow : table.findElements(By.tagName("tr"))){
            for (int i=1;i<=tableRow.findElements(By.tagName("td")).size();i++){
                if (tableRow.findElements(By.tagName("td")).get(0).getText().equals(computerName) &&tableRow.findElements(By.tagName("td")).get(3).getText().equals(companyName)){
                    result =true;
                    break;
                }
            }
        }
        return result;
    }

    public static boolean isHeaderNoComputerFoundVisible(){
        return headerNoComputerFound.isVisible();
    }
}
