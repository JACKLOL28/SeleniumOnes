package HandlingTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class static_table {
    public static void main(String[] args) {
            WebDriver driver = new ChromeDriver();

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

            driver.get("https://testautomationpractice.blogspot.com/");
            driver.manage().window().maximize();

            //1 . Find the total number of rows in the table -Static table
        int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
        System.out.println(rows);

        //2.Total number of columns
       int cls= driver.findElements(By.xpath("//table[@name='BookTable']//tr//th")).size();
        System.out.println(cls);

//        //3.Read data from specific row and column
//        String fetchdata=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td")).getText();
//        System.out.println(fetchdata);

        //4.Read all the values from all rows and columuns

//        for(int r=2;r<= rows;r++){
//
//            for(int c=1;c<=cls;c++){
//              String values=  driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
//            System.out.println(values +"\t");
//
//            }
//            System.out.println();
//        }

        //4.Print the booknamw whose author name is mukhesh
//        for(int r=2;r<=rows;r++){
//           String authorName= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
//           if (authorName.equals("Mukesh")){
//                String Bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
//               System.out.println(Bookname + "\t" + authorName);
//           }
//        }

        //5.Total prices
        int total=0;
        for (int r=2;r<=rows;r++){
            String prices=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
            System.out.println(prices);
            total =total + Integer.parseInt(prices);

        }
        System.out.println("total of all the prices are: "+total);
        driver.close();
    }
}
