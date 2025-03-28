package DatadrivernTesting;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritefilefromScratchinExcel {

    public static void main(String[] args) throws IOException {


        FileOutputStream file2 = new FileOutputStream("src/test/resources/Testcreate.xlsx");

        XSSFWorkbook workbook= new XSSFWorkbook();

       XSSFSheet sheet= workbook.createSheet("Sheet1");
        XSSFRow row1= sheet.createRow(0);
        row1.createCell(0).setCellValue("Welcome to game");
        row1.createCell(1).setCellValue("Where you");
        row1.createCell(2).setCellValue("would not win");

        XSSFRow row2= sheet.createRow(1);
        row2.createCell(0).setCellValue("Python");
        row2.createCell(1).setCellValue("Java");
        row2.createCell(2).setCellValue("C IS GANDA");

        XSSFRow row3= sheet.createRow(2);
        row3.createCell(0).setCellValue(true);
        row3.createCell(1).setCellValue(12.12);
        row3.createCell(2).setCellValue(78.1212);

        workbook.write(file2);
        workbook.close();
        file2.close();

        System.out.println("File has been created succesfully");
    }
}