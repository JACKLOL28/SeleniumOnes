package DatadrivenTestingActually;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Utilclass {

    public static FileInputStream fi;
    public static FileOutputStream fo;
    public static XSSFSheet sheet;
    public static XSSFWorkbook wb;
    public static XSSFRow row;
    public static XSSFCell cell;
    public static CellStyle style;

    public static int getrowCount(String xlfile, String xlsheetname) throws IOException {
        fi = new FileInputStream(xlfile);
        wb = new XSSFWorkbook(fi);
        sheet = wb.getSheet(xlsheetname);
        int rowcount = sheet.getLastRowNum();
        wb.close();
        fi.close();
        return rowcount;
    }

    public static int getCellCount(String xlfile, String xlsheetname, int rownum) throws IOException {
        fi = new FileInputStream(xlfile);
        wb = new XSSFWorkbook(fi);
        sheet = wb.getSheet(xlsheetname);
        row = sheet.getRow(rownum);
        int cellcount = row.getLastCellNum();
        wb.close();
        fi.close();
        return cellcount;

    }

    public static String getCelldata(String xlfile, String xlsheetname, int rownum, int colnum) throws IOException {
        fi = new FileInputStream(xlfile);
        wb = new XSSFWorkbook(fi);
        sheet = wb.getSheet(xlsheetname);
        row = sheet.getRow(rownum);
        cell = row.getCell(colnum);
        String data;
        try {
            DataFormatter formatter = new DataFormatter();
            data = formatter.formatCellValue(cell);
        } catch (Exception e) {
            data = "";
        }
        wb.close();
        fi.close();
        return data;
    }

    public static void setCellData(String xlfile, String xlsheetname, int rownum, int colnum, String data) throws IOException {
        // Open the Excel file
        try (FileInputStream fi = new FileInputStream(xlfile);
             XSSFWorkbook wb = new XSSFWorkbook(fi)) {

            // Get the sheet
            XSSFSheet sheet = wb.getSheet(xlsheetname);

            // Create the row if it doesn't exist
            XSSFRow row = sheet.getRow(rownum);
            if (row == null) {
                row = sheet.createRow(rownum);
            }

            // Create the cell if it doesn't exist
            XSSFCell cell = row.getCell(colnum);
            if (cell == null) {
                cell = row.createCell(colnum);
            }

            // Set the value of the cell
            cell.setCellValue(data);

            // Write changes back to the Excel file
            try (FileOutputStream fos = new FileOutputStream(xlfile)) {
                wb.write(fos);
            }
        }
    }

    public static void fillGreencolor(String xlfile, String xlsheetname, int rownum, int colnum) throws IOException {
             fi = new FileInputStream(xlfile); // Opening the file input stream
             wb = new XSSFWorkbook(fi); // Creating workbook from file input stream
             sheet = wb.getSheet(xlsheetname); // Getting the sheet by name
             row = sheet.getRow(rownum); // Getting the row by index

             // Check if the row is null, and create it if necessary
             if (row == null) {
                 row = sheet.createRow(rownum);
             }

             cell = row.getCell(colnum); // Getting the cell by column index

             // Check if the cell is null, and create it if necessary
             if (cell == null) {
                 cell = row.createCell(colnum);
             }

             style = wb.createCellStyle(); // Creating a new cell style
             style.setFillForegroundColor(IndexedColors.GREEN.getIndex()); // Setting background color to green
             style.setFillPattern(FillPatternType.SOLID_FOREGROUND); // Setting the fill pattern to solid

             cell.setCellStyle(style); // Applying the style to the cell

             fo = new FileOutputStream(xlfile); // Opening the file output stream to write changes back to the file
             wb.write(fo); // Writing the workbook to the file
             wb.close(); // Closing the workbook
             fi.close(); // Closing the file input stream
             fo.close(); // Closing the file output stream
         }

    public static void fillREDcolor(String xlfile, String xlsheetname, int rownum, int colnum) throws IOException {

        fi= new FileInputStream(xlfile);
        wb=new XSSFWorkbook(fi);
        sheet  =wb.getSheet(xlsheetname);
        row=sheet.getRow(rownum);

        if(row==null){
            row=sheet.createRow(rownum);////Very important line
        }
        cell=row.getCell(colnum);

        if(cell==null){
            cell=row.createCell(colnum);//---Very imprtant line
        }
        style= wb.createCellStyle();
        style.setFillForegroundColor(IndexedColors.RED.getIndex());
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        cell.setCellStyle(style);

        fo= new FileOutputStream(xlfile);
        wb.write(fo);
        wb.close();
        fi.close();
        fo.close();
    }






}
