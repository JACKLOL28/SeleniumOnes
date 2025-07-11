package WebDrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.nopcommerce.com/en");
        driver.manage().window().maximize();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

    }
}
