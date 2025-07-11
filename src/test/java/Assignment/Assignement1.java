package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Assignement1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("Selenium");
        driver.findElement(By.xpath("//*[@class='wikipedia-search-button']")).click();

        List<WebElement> links = driver.findElements(By.id("wikipedia-search-result-link"));
        System.out.println(links.size());

//        for (WebElement clickingonLink : links) {
//            String getTextsofAlllinks = clickingonLink.getText();
//            System.out.println(getTextsofAlllinks);
//
//            if (getTextsofAlllinks.equals("Selenium")) {
//                clickingonLink.click();
//                Thread.sleep(3000);
//            }

        for(int i=0;i<links.size();i++)
        {
            System.out.println(links.get(i).getText());
            if(links.get(i).getText().contains("Selenium"))
            {
                links.get(i).click();
                break;
            }

        }




        }
    }


