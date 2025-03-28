package WebDrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        WebElement logo = driver.findElement(By.xpath("//input[@id='name']"));
        System.out.println(logo.isDisplayed());
        System.out.println(logo.isEnabled());

        WebElement maleradiobutton = driver.findElement(By.id("male"));
        maleradiobutton.click();
        System.out.println(maleradiobutton.isSelected());

        driver.close();
    }
}
