package LocatorAnna;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator2 {
    public static void main(String[] args) {

        WebDriver driver= new ChromeDriver();

        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        //CSS selectors

        //Tag id

//        driver.findElement(By.cssSelector("input#email")).sendKeys("Laptop@gmail.com");
//        driver.findElement(By.cssSelector("input#pass")).sendKeys("Laptop");

//        By tag and artribute
        driver.findElement(By.cssSelector("input[placeholder='Email address or phone number']")).sendKeys("Ayoooooo");
        driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("Password");


        driver.navigate().to("https://www.redbus.in/");

        //By tag classname
        driver.findElement(By.cssSelector("button.sc-cvbbAY")).click();//No spaces are allowed

        //By tag class name and artribute

        driver.findElement(By.cssSelector("button.sc-cvbbAY[tabindex='5']")).click();


        driver.close();



    }
}
