package com.intebanking.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	public static FileInputStream fileLoc;
    public static XSSFWorkbook xBook;
    public static XSSFSheet xSheet;
    public static XSSFRow row;
    public static XSSFCell cell;
    
    
    // method  to fetch the row count
    public static int getRowCount(String XLPath, String XSheetName) throws IOException {
        fileLoc = new FileInputStream(XLPath);
        xBook = new XSSFWorkbook(fileLoc);
        xSheet = xBook.getSheet(XSheetName);
        int rowCount = xSheet.getLastRowNum();
        return rowCount;
    }
    
    
    // method to fetch the cell count based on the row number
    
    public static int getCellCount(String XLPath, String XSheetName, int rowNum) throws IOException {
        fileLoc = new FileInputStream(XLPath);
        xBook = new XSSFWorkbook(fileLoc);
        xSheet = xBook.getSheet(XSheetName);
        row = xSheet.getRow(rowNum);
        int cellCount = row.getLastCellNum();
        return cellCount;
    }
    
    
    
    // method to read the data from the each cell in the String format.
    
    public static String getCellData(String XLPath, String XSheetName, int rowNum, int cellNum) throws IOException {
        
        fileLoc = new FileInputStream(XLPath);
        xBook = new XSSFWorkbook(fileLoc);
        xSheet = xBook.getSheet(XSheetName);
        row = xSheet.getRow(rowNum);
        cell = row.getCell(cellNum);
        
        DataFormatter format = new DataFormatter();
        String cellData = format.formatCellValue(cell);
        
        fileLoc.close();
        xBook.close();
        
        return cellData;
        

}
}