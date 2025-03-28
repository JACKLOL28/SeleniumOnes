package Screenashotssss;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

public class aaosikhaoscreenshotlena {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();

        //Full page screenshot
//        TakesScreenshot ts= (TakesScreenshot)driver;
//        File sourcefile=ts.getScreenshotAs(OutputType.FILE);
//        File targetfile= new File(System.getProperty("user.dir")+"\\target\\Screenshots\\fullpage.png");
//        sourcefile.renameTo(targetfile);

        //Capture screenshot of specific area
//        WebElement particulararea = driver.findElement(By.xpath("//div[text()='Best Truewireless Headphones']"));
//        File sourcefile= particulararea.getScreenshotAs(OutputType.FILE);
//        File targetFile= new File(System.getProperty("user.dir")+"\\target\\Screenshots\\areaka.png");
//        sourcefile.renameTo((targetFile));

        //for particular webelement also its same

        WebElement flipkartlogo = driver.findElement(By.xpath("//img[@title='Flipkart']"));
        File sourcefile= flipkartlogo.getScreenshotAs(OutputType.FILE);
        File targetfile= new File(System.getProperty("user.dir")+"\\target\\Screenshots\\log.png");
        sourcefile.renameTo((targetfile));
    }
}
