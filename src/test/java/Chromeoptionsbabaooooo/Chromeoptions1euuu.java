package Chromeoptionsbabaooooo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chromeoptions1euuu {
    public static void main(String[] args) {

        //So now we would see maximized window using chrome options
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");

        WebDriver driver= new ChromeDriver(options);
        driver.get("https://www.flipkart.com/");

        driver.close();
    }
}
