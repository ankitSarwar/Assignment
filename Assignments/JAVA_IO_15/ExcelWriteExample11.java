package JAVA_IO_15;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

//  11. Write a program to write data to excel
public class ExcelWriteExample11 {
    public static void main(String[] args) {
        try (Workbook workbook = new XSSFWorkbook();
             FileOutputStream fos = new FileOutputStream("output.xlsx")) {
            Sheet sheet = workbook.createSheet("Sheet1");

            // Create some data
            Row row = sheet.createRow(0);
            Cell cell = row.createCell(0);
            cell.setCellValue("Hello");
            cell = row.createCell(1);
            cell.setCellValue("World");

            // Write the workbook to the output file
            workbook.write(fos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

