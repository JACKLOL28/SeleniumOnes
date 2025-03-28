package HandlingTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Dyanamic_Table_2 {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

//for clicking on pagination using for lloop
        for(int p=1; p<=4;p++){
            if(p>1){
                WebElement pagination = driver.findElement(By.xpath("//ul[@id='pagination']//li[" + p + "]"));
                pagination.click();
            }

            //Now we need to count the number of rows for each page , The reason we are using for loop for this
            //is because for every page the number of pages would be different

            int rows=driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr")).size();
            System.out.println(rows);

            //For printing and clicking on the boxes
            for(int r=1; r<=rows;r++){
               String productName= driver.findElement(By.xpath("//table[@id='productTable']//tr["+r+"]//td[2]")).getText();
                String price = driver.findElement(By.xpath("//table[@id='productTable']//tr["+r+"]//td[3]")).getText();
                Thread.sleep(2000);
                driver.findElement(By.xpath("//table[@id='productTable']//tr["+r+"]//td[4]//*[@type='checkbox']")).click();
                Thread.sleep(2000);
                System.out.println(productName + "\t" +price);
            }
        }
    }
}