package TestNGDataProviders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class AyyoData1 {

    WebDriver driver;

    @BeforeClass
    void setup() {

        driver = new ChromeDriver();
        System.out.println("Before class method");
    }

    @Test(dataProvider = "dp1")
    void testlogin(String username, String password) throws InterruptedException {

        driver.get("https://practicetestautomation.com/practice-test-login/");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("submit")).click();

        boolean TextOnLoginPage = driver.findElement(By.xpath("//strong[contains(text(),'Congratulations student. You successfully logged i')]")).isDisplayed();

        if (TextOnLoginPage) {
            Assert.assertTrue(true);
        } else {
            Assert.fail();
        }

    }

    @AfterClass
    void teardown() {
        System.out.println("Test is finished");
        driver.quit();
    }

    @DataProvider(name = "dp1", indices = {0, 3})
    Object[][] logindata() {
        return new Object[][]{

                {"john", "yeda"},
                {"Jaikishan", "NewLearner"},
                {"nameis", "12345"},
                {"student", "Password123"}
        };
    }
}





