package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class OrangeHRMdemo {

    WebDriver driver;

    @Test(priority = 1)
    void openapp(){
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
    }

    @Test(priority = 2)
    void testlogo() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//img[@alt=\"orangehrm-logo\"][1]")).isDisplayed();
        System.out.println("The logo is displayed");
    }

    @Test(priority = 3)
    void login() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[text()=' Login ']")).click();
    }

    @Test(priority=4)
    void closeapp(){
        driver.quit();
    }


}
