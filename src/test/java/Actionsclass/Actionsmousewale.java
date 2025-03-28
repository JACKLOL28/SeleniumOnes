package Actionsclass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Actionsmousewale {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        //Mouse hover actioncs
//        WebElement pointme = driver.findElement(By.xpath("//button[contains(text(),'Point')]"));
//        WebElement Laptops=driver.findElement(By.xpath("//div[@class='dropdown-content']//a[2]"));
//
//        //Creating actions class
//        Actions act= new Actions(driver);
//        act.moveToElement(pointme).moveToElement(Laptops).click().perform();

        //Right click
//        driver.get("https://practice.expandtesting.com/context-menu");
//        driver.manage().window().maximize();
//
//        WebElement rightbutton=driver.findElement(By.xpath("//div[@id='hot-spot']"));
//        Actions act= new Actions(driver);
//        act.contextClick(rightbutton).perform();
//
//        //click on any option
//        Alert myalert = driver.switchTo().alert();
//        myalert.accept();

        //double click on the element yesssssssssaaaaa
//        WebElement buttondouble = driver.findElement(By.xpath("//button[text()='Copy Text']"));
//        Actions act = new Actions(driver);
//        act.doubleClick(buttondouble).perform();

        //drag and drop
//        Actions act = new Actions(driver);
//        WebElement drag=driver.findElement(By.id("draggable"));
//        WebElement drop = driver.findElement(By.id("droppable"));
//
//        act.dragAndDrop(drag,drop).perform();

        //Slider actions
        //now to loocate the slider we need to locate the slider elemennt first

        driver.navigate().to("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
        Thread.sleep(2000);
        WebElement Lslider = driver.findElement(By.xpath("//div[@id='slider-range']//span[1]"));
        System.out.println(Lslider.getLocation());

        Actions act = new Actions(driver);
        act.dragAndDropBy(Lslider,300,251).perform();
        System.out.println(Lslider.getLocation());


    }
}
