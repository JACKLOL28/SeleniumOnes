package Javascriptexecutoranaaaaaa;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Scrolling1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        JavascriptExecutor js= (JavascriptExecutor)driver;
        //1.Scroll down the page by pixel number
//        js.executeScript("window.scrollBy(0,2000)","");
//        System.out.println(js.executeScript("return window.pageYOffset;"));

        //2.Scroll the page till element is visibled
//        WebElement scrolltillthis = driver.findElement(By.xpath("//h2[text()='Footer Links']"));
//        js.executeScript("arguments[0].scrollIntoView(true);", scrolltillthis);

        //3.Scroll till the bottom of the page
        js.executeScript("window.scrollBy(0, document.body.scrollHeight);");

        Thread.sleep(2000);
        //4.Scroll back to initial position
        js.executeScript("window.scrollBy(0, -document.body.scrollHeight);");
    }
}
