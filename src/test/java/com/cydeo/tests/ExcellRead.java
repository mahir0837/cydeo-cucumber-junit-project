package com.cydeo.tests;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcellRead {

    @Test
    public void read_from_excel_file() throws IOException {
        String path="SampleData.xlsx";

        //read from excel file we need to loaded it to FileInputStream
        FileInputStream fileInputStream=new FileInputStream(path);

        //workbook => sheet=> row=>cell

        //1- Create a workbook
        XSSFWorkbook workbook=new XSSFWorkbook(fileInputStream);

        //2-We need to get specific sheet from currently open workbook
        XSSFSheet sheet=workbook.getSheet("Employees");

        //3- Select row and cell

        //TODO: Printout Mary's cell
        System.out.println("sheet.getRow(2) = " + sheet.getRow(1).getCell(0));

        //TODO: Printout Developer Job
        System.out.println("sheet.getRow(3).getCell(2) = " + sheet.getRow(3).getCell(2));

        //Return the count of used cells only
        //starts counting from '1'
        int usedRows=sheet.getPhysicalNumberOfRows();
        System.out.println("usedRows = " + usedRows);

        /*
        Returns the number from top cell to bottom cell and
        it doesn't care if the cell is empty or not.
        Starts counting from '0'
         */
        int lastUsedRow=sheet.getLastRowNum();
        System.out.println("lastUsedRow = " + lastUsedRow);

        //TODO: Create a logic to print Vinod's name dynamically

        for (int rowNum = 0; rowNum < usedRows; rowNum++) {
            if (sheet.getRow(rowNum).getCell(0).toString().equals("Vinod")){
                System.out.println("row num: "+rowNum);
                System.out.println("sheet.getRow(rowNum).getCell(0) = " + sheet.getRow(rowNum).getCell(0));
            }
        }
    }

}
