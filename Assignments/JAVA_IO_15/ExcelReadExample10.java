package JAVA_IO_15;

import java.io.FileInputStream;
import java.io.IOException;

//    10. Write a program to read data from excel
public class ExcelReadExample10 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("example.xlsx");
             Workbook workbook = new XSSFWorkbook(fis)) {
            Sheet sheet = workbook.getSheetAt(0); // assuming the data is in the first sheet

            for (Row row : sheet) {
                for (Cell cell : row) {
                    switch (cell.getCellType()) {
                        case STRING:
                            System.out.print(cell.getStringCellValue() + "\t");
                            break;
                        case NUMERIC:
                            System.out.print(cell.getNumericCellValue() + "\t");
                            break;
                        // Add more cases for other data types as needed
                    }
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

