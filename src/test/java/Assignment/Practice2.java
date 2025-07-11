package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.SQLOutput;
import java.time.Duration;
import java.util.List;

public class Practice2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id='APjFqb']")).sendKeys("Bike");

        List<WebElement> ele= driver.findElements(By.xpath("//li[@role='presentation']//div[@role='presentation']//span//b"));

        System.out.println(ele.size());

        for(WebElement e:ele){
            System.out.println(e.getText());

            if(e.getText().contains("wale"))
            {
                e.click();
                Thread.sleep(2000);
            }
            else {
                System.out.println("OOps pagal ho kya");
            }
        }




    }
}
