package DatePicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class datepicker2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demo.automationtesting.in/Datepicker.html");
        driver.manage().window().maximize();

        driver.findElement(By.id("datepicker2")).click();
        //Expected date and year
//        String date= "28";
//        String year= "2027";
//        String month= "August";
        selectyearandMonth(driver, "August", "2027");
        selectDate(driver,"28");

    }

    //Method to select the year and month
    static void selectyearandMonth(WebDriver driver, String month, String year) throws InterruptedException {


        Thread.sleep(2000);
        WebElement selectcurrentmonth = driver.findElement(By.xpath(" //select[@title='Change the month']"));
        Select currentmonth = new Select(selectcurrentmonth);
        currentmonth.selectByVisibleText(month);

        Thread.sleep(2000);

        WebElement selectcurrentyear = driver.findElement(By.xpath("//select[@title='Change the year']"));
        Select currentyear = new Select(selectcurrentyear);
        currentyear.selectByVisibleText(year);
    }
    static void selectDate(WebDriver driver , String date){
        List<WebElement> dates = driver.findElements(By.xpath("//a[contains(@title, 'Select')]"));
        for(WebElement dat:dates)
        { 
            if(dat.getText().equals(date)){
                dat.click();
                break;
            }
        }
    }
}
