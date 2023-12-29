package com.cydeo.tests;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcellWrite {

    @Test
    public void excel_write() throws IOException {

        String path = "SampleData.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);

        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheet("Employees");

        XSSFCell salaryCell = sheet.getRow(0).createCell(3);
        salaryCell.setCellValue("Salary");

        XSSFCell salary1 = sheet.getRow(1).createCell(3);
        salary1.setCellValue(200000);
        XSSFCell salary2 = sheet.getRow(2).createCell(3);
        salary2.setCellValue(110000);
        XSSFCell salary3 = sheet.getRow(3).createCell(3);
        salary3.setCellValue(135000);
        XSSFCell salary4 = sheet.getRow(4).createCell(3);
        salary4.setCellValue(145000);

        //open to write to the file  : FileInputStream--> reading
        //save changes                : FileOutputStream-->Writing
        FileOutputStream fileOutputStream = new FileOutputStream(path);

        //save/write changes to the workbook
        workbook.write(fileOutputStream);
        fileOutputStream.close();
        workbook.close();
        fileInputStream.close();
    }
}
