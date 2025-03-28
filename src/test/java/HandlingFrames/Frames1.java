package HandlingFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Frames1 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");

        driver.manage().window().maximize();

        driver.switchTo().frame("frm1");

        driver.findElement(By.id("selectnav1")).click();
        driver.switchTo().defaultContent();

        driver.switchTo().frame("frm2");
        driver.findElement(By.id("firstName")).sendKeys("Jaikishan");
        driver.findElement(By.id("lastName")).sendKeys("was here");


        //Now lets go forward to the nested frame
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frm3");
        driver.findElement(By.id("name")).sendKeys("Your Father");
        driver.switchTo().frame("frm1");
        driver.findElement(By.id("selectnav1")).click();


    }
}
