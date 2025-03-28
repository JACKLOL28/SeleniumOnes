package HandleDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class HandlingBootStrapdropdown {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
        driver.manage().window().maximize();
        //Selecting the dropdown first

        driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();

        //Selecting the one single dropdown from the dropdown menu
        driver.findElement(By.xpath("//input[@value='Angular']")).click();

        //to Select multiple dropdowns


        List<WebElement> options=driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//label"));

        System.out.println(options.size());

        for(WebElement op:options){
            System.out.println(op.getText());
            String eachoption = op.getText();
            if(eachoption.equals("Java")|| eachoption.equals("Python")){
                op.click();
            }
        }

    }
}
