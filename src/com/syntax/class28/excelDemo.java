package com.syntax.class28;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class excelDemo {

    public static void main(String[] args) throws IOException {
        String path = "Data/excelDemo.xlsx";
        FileInputStream fis = new FileInputStream(path);
        XSSFWorkbook excelfile = new XSSFWorkbook(fis);
        Sheet sheet = excelfile.getSheet("Sheet1");
        Row row1= sheet.getRow(0);
        Cell cell1= row1.getCell(0);
        System.out.println(cell1);
    }
}
