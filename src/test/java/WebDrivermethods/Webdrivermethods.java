package WebDrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Webdrivermethods {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);

        System.out.println(driver.getTitle());

        System.out.println(driver.getCurrentUrl());

        System.out.println(driver.getPageSource());// Never used not most important

       String windowId= driver.getWindowHandle();//--- Very Important methods
        System.out.println(windowId);

        driver.findElement(By.linkText("OrangeHRM, Inc")).click();
        Set<String> windowIDS=driver.getWindowHandles();// very important-- Why string ? Becassue alll Ids are in string format
       //Why Set instead of List? Each window Id has different set of collections
        System.out.println(windowIDS);


    }
}
