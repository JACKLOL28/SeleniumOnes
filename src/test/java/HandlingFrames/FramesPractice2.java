package HandlingFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FramesPractice2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://ui.vision/demo/webtest/frames/");
        driver.manage().window().maximize();

        WebElement Frame1 = driver.findElement(By.xpath("//*[@src='frame_1.html']"));
        driver.switchTo().frame(Frame1);
        driver.findElement(By.name("mytext1")).sendKeys("HAHAHAJACKU");
        driver.switchTo().defaultContent();

        WebElement Frame2 = driver.findElement(By.xpath("//*[@src='frame_5.html']"));
        driver.switchTo().frame(Frame2);
        driver.findElement(By.name("mytext5")).sendKeys("YO BABY");
        driver.findElement(By.linkText("https://a9t9.com")).click();


        WebElement lo=driver.findElement(By.xpath("//*[@class='responsive-img'][1]"));
        System.out.println(lo.isDisplayed());

    }
}
