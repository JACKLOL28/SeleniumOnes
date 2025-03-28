package HandleDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Autosuggestion_Dropdown {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        driver.findElement(By.name("q")).sendKeys("cars");

        List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']//li"));
        System.out.println(list.size());

//        for(int i=0; i< list.size();i++){
//            System.out.println(list.get(i).getText());
//
//            if(list.get(i).getText().equals("cars under 10 lakhs"))
//            {
//                list.get(i).click();
//            }
//
//        }

        //Enhanced for for loop se
        for(WebElement li:list){
            System.out.println(li.getText());
            if(li.getText().equals("cars under 5 lakhs")){
                li.click();
            }
        }
    }
}
