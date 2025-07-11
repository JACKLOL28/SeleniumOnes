package WebDrivermethods;

import com.google.common.base.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class waitCommands {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//Implicit wait
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


//
//        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
//
//        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");

        //Explicit wait
        WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));

        WebElement username = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
        username.sendKeys("Admin");

//
//       WebElement password= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
//        password.sendKeys("admin123");
//
//        WebElement clickbutton = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@type='submit']")));
//        clickbutton.click();


       //Syntax for explicit wait

        //fluent wait
        Wait<WebDriver> flue= new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);

        WebElement usernname = flue.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath("//input[@name='username']"));
            }
        });
        usernname.sendKeys("Admin");
    }

}
