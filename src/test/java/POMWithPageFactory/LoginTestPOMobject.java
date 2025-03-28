package POMWithPageFactory;

import POMwithoutPagefactory.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTestPOMobject {

    WebDriver driver;

    @BeforeClass
    void setup(){
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
    }

    @Test
    void logintest() throws InterruptedException {
        Loginpagefatory lp = new Loginpagefatory(driver);
        lp.setUsername("Admin");
        lp.setPassword("admin123");
        lp.clickOnLoginbutton();
        Thread.sleep(3000);

        Assert.assertEquals(driver.getTitle(),"OrangeHRM");
    }

    @AfterClass
    void teardown(){
        driver.quit();
    }
}
