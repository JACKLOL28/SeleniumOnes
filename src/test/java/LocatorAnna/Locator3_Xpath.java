package LocatorAnna;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator3_Xpath {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();

        //Xpath by single attribute
//        driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Mobile");
//
//        //Xpath by multiple Attribute
//        driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("T-shirts");

        //Xpath by text
//         driver.findElement(By.xpath("//a[text()='MacBook']")).click();

        //Xpath by contains
//        driver.findElement(By.xpath("//input[contains(@name,'sea')]")).sendKeys("Wallet");

        //Xpath by starts-with
//        driver.findElement(By.xpath("//a[starts-with(text(),'iP')]")).click();

    }

}
