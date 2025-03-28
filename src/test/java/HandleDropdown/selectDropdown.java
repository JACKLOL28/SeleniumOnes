package HandleDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class selectDropdown {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        WebElement drop = driver.findElement(By.id("country"));
        Select dropCountry = new Select(drop);
//        dropCountry.selectByVisibleText("India");
//        dropCountry.selectByIndex(3);
//        dropCountry.selectByValue("canada");

        //2 .How to get all the dropdown options
        List<WebElement> options = dropCountry.getOptions();
        System.out.println(options.size());

        //Printing the option
//        for(int i=0;i< options.size();i++){
//            System.out.println(options.get(i).getText());
//        }

        //Printing options by enhanced for loop
        for (WebElement op : options) {
            System.out.println(op.getText());
        }
    }
}