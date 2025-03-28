package AlertPopups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HandleAlertPopups {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));


//        driver.get("https://testautomationpractice.blogspot.com/");

        //1.Handling the normal alert
//        driver.findElement(By.id("alertBtn")).click();
//
//        Alert myalert = driver.switchTo().alert();
//        System.out.println(myalert.getText());
//
//        myalert.accept();

        //2.Handling confirm alert
//        driver.findElement(By.id("confirmBtn")).click();
//
//        Alert myalert = driver.switchTo().alert();
//        System.out.println(myalert.getText());
//
////        myalert.accept();
//        myalert.dismiss();

        //3.Handlling prompt alert

//        driver.findElement(By.id("promptBtn")).click();
//
//        Alert myalert = driver.switchTo().alert();
//        System.out.println(myalert.getText());
//
//        myalert.sendKeys("Jaikishan shahari");
//        myalert.accept();


        //Interwiew question
        //  Handling Alert popups witthout switching to window
//        driver.findElement(By.id("alertBtn")).click();
//      Alert alertis=  mywait.until(ExpectedConditions.alertIsPresent());
//      alertis.accept();



        //Directly enter basic auth from the URL sidhe sidhe--Interview questions
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
    }
}
