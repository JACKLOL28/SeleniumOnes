package HandlingTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class staticTable2 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://blazedemo.com/");
        driver.manage().window().maximize();

        WebElement dropd = driver.findElement(By.xpath("//select[@name='fromPort']"));
        Select dropdown= new Select(dropd);
        dropdown.selectByValue("Philadelphia");

        WebElement toPort = driver.findElement(By.xpath("//select[@name='toPort']"));

        Select dropto = new Select(toPort);
        dropto.selectByValue("Rome");

        driver.findElement(By.xpath("//input[@type='submit']")).click();

        //find the number of rows
        int rows=driver.findElements(By.xpath("//table[@class='table']//tr")).size();

        System.out.println(rows);
        int minvalue= 0;
        for(int r=2; r<=rows;r++){
            String prices = driver.findElement(By.xpath("//table[@class='table']//tr["+r+"]//td[6]")).getText();
            System.out.println(prices);
            double price = Double.parseDouble(prices.replace("$", "").trim());
            System.out.println(price);
            }
        }






    }