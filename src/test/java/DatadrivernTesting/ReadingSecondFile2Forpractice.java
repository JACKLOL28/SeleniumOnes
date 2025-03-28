package DatadrivernTesting;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingSecondFile2Forpractice {
    public static void main(String[] args) throws IOException {

        FileInputStream file1 = new FileInputStream("src/test/resources/Timepasssheet.xlsx");

        XSSFWorkbook workbook = new XSSFWorkbook(file1);
        XSSFSheet sheet = workbook.getSheet("Sheet1");

        int rows = sheet.getLastRowNum();
        int cells = sheet.getRow(1).getLastCellNum();

        System.out.println("No of rows:" + rows);
        System.out.println("No of cells: " + cells);


        try {
            for (int r = 0; r <= rows; r++) {
                XSSFRow currentrows = sheet.getRow(r);
                for (int c = 0; c < cells; c++) {
                    XSSFCell cellss = currentrows.getCell(c);
                    System.out.print(cellss.toString()+"\t");
                }

            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());;
        }
            workbook.close();
            file1.close();

    }
}
