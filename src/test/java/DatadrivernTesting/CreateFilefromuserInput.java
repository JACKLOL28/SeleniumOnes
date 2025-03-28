package DatadrivernTesting;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CreateFilefromuserInput {

    public static void main(String[] args) throws IOException {
        FileOutputStream file= new FileOutputStream("src/test/resources/userinput.xlsx");

        XSSFWorkbook book = new XSSFWorkbook();
        XSSFSheet Sheet=book.createSheet("Dynamic sheet from user.xlsx");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many rows you want?");

        int totalrows=sc.nextInt();
        System.out.println("Enter how many columns you want");
        int totalcells= sc.nextInt();

        for(int r=0 ; r<=totalrows; r++){
            XSSFRow crow=Sheet.createRow(r);
            for(int c=0;c<totalcells; c++){
                XSSFCell cell=crow.createCell(c);
                cell.setCellValue(sc.next());
            }
        }
        book.write(file);
        book.close();
        file.close();

        System.out.println("File is being created");

    }
}
