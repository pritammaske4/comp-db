package practice;

import java.io.File;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;


public class ExcelFileDemo
{
    String fileName = "Test-case-template-xls.xls";
    String filePath = "C:\\Users\\maskepri\\Desktop\\Test-case-template-xls.xls";
    String sheetName = "Test Case Template Example";

    public void readExcel(String filePath,String fileName ,String sheetName ) throws IOException {
        File file =    new File(filePath+"\\"+fileName);
        FileInputStream inputStream = new FileInputStream(file);
        Workbook w1 = null;

        String fileExtensionName = fileName.substring(fileName.indexOf("."));

         if(fileExtensionName.equals(".xls")){

            //If it is xls file then create object of XSSFWorkbook class

            w1 = new HSSFWorkbook(inputStream);

        }
        Sheet sheet1 = w1.getSheet(sheetName);

        //Get the current count of rows in excel file

        int rowCount = sheet1.getLastRowNum()-sheet1.getFirstRowNum();

    }
}
