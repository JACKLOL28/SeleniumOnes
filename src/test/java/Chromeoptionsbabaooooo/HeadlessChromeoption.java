package Chromeoptionsbabaooooo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeoption {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://practice.expandtesting.com/");
        String title=driver.getTitle();
        if(title.equals("Practice Test Automation WebSite")){
            System.out.println("Test cases is passed");
        }
        else {
            System.out.println("Test is failed");
        }

    }
}
