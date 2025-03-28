package Javascriptexecutoranaaaaaa;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class javascriptexe1 {
    public static void main(String[] args) {

        //Now lets learn when we get the exception element intercepted exception
        //we usee java scriptexecutor methods

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        WebElement nameform = driver.findElement(By.id("name"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('value', 'kishu')", nameform);

        WebElement radiobuttonmale = driver.findElement(By.id("male"));
        js.executeScript("arguments[0].click()",radiobuttonmale);

    }
}
