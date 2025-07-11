package HandleChecboxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.time.Duration;
import java.util.List;

public class checkbo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        //Now for selecting one checkbox
//        driver.findElement(By.id("monday")).click();

        //For clicking the multiple checkboxes or all checkboxes in week pannel

        List<WebElement> checkboxes = driver.findElements(By.xpath("//*[@type='checkbox']"));


//
//        for(int i=0; i<=checkboxes.size();i++){
//
//            checkboxes.get(i).click();
//        }


//        By enhanced for loop
//        for(WebElement checbox:checkboxes){
//            checbox.click();
//        }

        //for clicking the last 3 elements of checkboxes
//        for(int i=4;i<checkboxes.size();i++)
//        {
//            checkboxes.get(i).click();
//        }

        //For clicking the First 3 elements of checkboxes

        for (int i=0; i<3;i++){
            checkboxes.get(i).click();
        }
//
//        //Now for Unseleting this elements
        Thread.sleep(3000);
//
        for (int i=0; i<3;i++){
            checkboxes.get(i).click();
        }
    }
}
