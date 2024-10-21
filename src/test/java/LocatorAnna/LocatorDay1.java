package LocatorAnna;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorDay1 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.opencart.com/index.php?route=marketplace/extension");

        //Maximize
        driver.manage().window().maximize();

        //1.Locator by name
//        driver.findElement(By.name("filter_search")).sendKeys("Mac");

        //2.Find element by locator by id

//        boolean logosiDisplayedStatus=driver.findElement(By.id("extension-search")).isDisplayed();
//        System.out.println(logosiDisplayedStatus);

        //3.Link Text

//        driver.findElement(By.linkText("Features")).click();

        //4.Partial Link Text
//        driver.findElement(By.partialLinkText("Down")).click();

        //Tagname and class se
//        List<WebElement> links =driver.findElements(By.tagName("a"));
//        System.out.println("The total links present are"+links.size());




        driver.close();







    }
}
