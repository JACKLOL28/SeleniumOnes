package DatadrivernTesting;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingfileFromExcelSheet {
    public static void main(String[] args) throws IOException {

        FileInputStream file= new FileInputStream("src/test/resources/PAPI issues .xlsx");

        XSSFWorkbook workbook= new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheet("Sheet1");

        int totalnoofrows=sheet.getLastRowNum();
        int totalnoofcells=sheet.getRow(1).getLastCellNum();

        System.out.println("No of rows:" +totalnoofrows);
        System.out.println("No of cells:" +totalnoofcells);

        for(int r=0;r<=totalnoofrows;r++){
            XSSFRow currentRow = sheet.getRow(r);
            for(int c=0;c<totalnoofcells;c++){
                 XSSFCell currentCell = currentRow.getCell(c);
                System.out.print(currentCell.toString() + "\t");
            }
        }
        workbook.close();
        file.close();



    }
}
