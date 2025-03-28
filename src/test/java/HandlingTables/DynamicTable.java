package HandleDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DynamicTable {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get(("https://demo3x.opencartreports.com/admin/index.php?route=common/login"));
        driver.manage().window().maximize();

        driver.findElement(By.name("username")).sendKeys("demo");
        driver.findElement(By.name("password")).sendKeys("demo");

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        driver.findElement(By.id("menu-sale")).click();
        driver.findElement(By.xpath("//*[@id='menu-sale']//li[1]")).click();

        String Text=driver.findElement(By.xpath("//div[contains(text(),'Pages')]")).getText();
     int pages = Integer.parseInt(Text.substring(Text.indexOf("(")+1 , Text.indexOf("Pages")-1));


     //Repeating pages till it ends
        for(int p =1; p<=pages; p++){

            if(p>1){
                WebElement active_page = driver.findElement(By.xpath("//a[normalize-space()='>']"));
                active_page.click();
            }

            //Start reading the data from the particular pages
            //First find the no of rows

            int rows= driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
            System.out.println(rows);

            for(int r=1; r<=rows; r++){
              String customerName=  driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[3]")).getText();
              String Column=  driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[5]")).getText();
                System.out.println(customerName +"\t" + Column);
            }

        }


    }
}
