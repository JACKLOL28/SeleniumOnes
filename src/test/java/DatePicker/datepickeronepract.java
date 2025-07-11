package DatePicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class datepickeronepract {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://jqueryui.com/datepicker/");
        //first we need to switch to frame but this frame contains xpath
        WebElement frame1 = driver.findElement(By.xpath("//*[@class='demo-frame']"));
        driver.switchTo().frame(frame1);

       driver.findElement(By.xpath("//*[@class='hasDatepicker']")).click();


        //expected data
//        String month = "January";
//        String year = "2025";
//        String date = "20";
        selectyearandmonth(driver,"2035","January");
        selectdate(driver, "21");


    }
    static void selectyearandmonth(WebDriver driver,String year ,String month){
        while(true){
            String currentmonth=driver.findElement(By.xpath("//*[@class='ui-datepicker-month']")).getText();
            String currentYear=driver.findElement(By.xpath("//*[@class='ui-datepicker-year']")).getText();

            if(currentmonth.equals(month)&& currentYear.equals(year)){
                break;
            }
            //Next button--- Next previous nai baba kyunki abhi yeh wala date future mei hai

            driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-e']")).click();
        }


        }
    static void selectdate(WebDriver driver, String date) {

        List<WebElement> alldates = driver.findElements(By.xpath("//*[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
        System.out.println(alldates);
        for(WebElement dt:alldates){
            if(dt.getText().equals(date)){
                dt.click();
                break;
            }

        }
    }
    }


