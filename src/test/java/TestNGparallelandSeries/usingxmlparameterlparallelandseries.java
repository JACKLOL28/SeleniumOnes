package TestNGparallelandSeries;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class usingxmlparameterlparallelandseries {

    WebDriver driver;
    @BeforeClass
    @Parameters("browser")
    void setup(String br) throws InterruptedException {

        switch (br.toLowerCase()){
            case "chrome" : driver= new ChromeDriver();
                            break;
            case "edge" : driver= new EdgeDriver();
                           break;
            case "firefox": driver = new FirefoxDriver();
                            break;

            default:
                System.out.println("Invalid browser selected");
                return;
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(3000);
    }

    @Test(priority = 1)
    void testlogo()
    {
        boolean logostatus = driver.findElement(By.xpath("//img[@alt= 'company-branding']")).isDisplayed();
        Assert.assertEquals(logostatus,true);
    }

    @Test(priority = 2)
    void testTitle(){
        Assert.assertEquals(driver.getTitle(), "OrangeHRM");
    }

    @Test(priority = 3)
    void TestUrl(){
        Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }

    @AfterClass
    void teardown(){
        driver.quit();
    }

}
