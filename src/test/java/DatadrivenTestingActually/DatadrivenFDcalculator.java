package DatadrivenTestingActually;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.time.Duration;

public class DatadrivenFDcalculator {
    public static void main(String[] args) throws IOException, InterruptedException , IndexOutOfBoundsException, NullPointerException{

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html?classic=true");
        driver.manage().window().maximize();

        String filepath = "src/test/resources/FDcalculator.xlsx";
        //rowcount chahiye for loop ka data use karne ke liye aur set karne ke liye
        //Column kam hai toh sirf row count bhi chal jayega

        int rows=Utilclass.getrowCount(filepath,"Sheet1");
//        System.out.println(rows);
       int cols= Utilclass.getCellCount(filepath,"Sheet1",rows);
        System.out.println(cols);

        for(int i= 1;i<=rows;i++){
            //1.Read data from excel
System.out.println(i);
            String principle=Utilclass.getCelldata(filepath,"Sheet1",i,0);
            String roi= Utilclass.getCelldata(filepath,"Sheet1",i,1);
            String pernum= Utilclass.getCelldata(filepath,"Sheet1",i,2);
            String pertime= Utilclass.getCelldata(filepath,"Sheet1",i,3);
            String Frequency= Utilclass.getCelldata(filepath,"Sheet1",i,4);
            String expected_mvalue= Utilclass.getCelldata(filepath,"Sheet1",i,5);
            System.out.println(expected_mvalue);

            //2.pass the data in the application using above file that is excel file
            //a.finding the xpaths or paths for elements
            driver.findElement(By.id("principal")).sendKeys(principle);
            driver.findElement(By.id("interest")).sendKeys(roi);
            driver.findElement(By.id("tenure")).sendKeys(pernum);
            //ab kya hai ki form pe dropdowns bhi hai toh uske liye alag se define karo baba
            WebElement perioddropdown = driver.findElement(By.id("tenurePeriod"));
            Select drp1= new Select(perioddropdown);
            drp1.selectByVisibleText(pertime);

            WebElement typeoffreq = driver.findElement(By.id("frequency"));
            Select drp2= new Select(typeoffreq);
            drp2.selectByVisibleText(Frequency);

            driver.findElement(By.xpath("//div[@class=\"CTR PT15\"]//a[@onclick=\"return getfdMatVal(this);\"]")).click();
            Thread.sleep(2000);

            String actualmatval = driver.findElement(By.xpath("//span[@name=\"resp_matval\"]//strong")).getText();

            //Now the inputs have been done now we need to write the validations
                        //now we know that it has been in string but we cannot compare in strings
            double expectmvalue = Double.parseDouble(expected_mvalue);
            double actualmat = Double.parseDouble(actualmatval);
            System.out.println(actualmatval);
            System.out.println(expectmvalue);

            if(expectmvalue==actualmat) {
                System.out.println("Test case is passed");
                Utilclass.setCellData(filepath, "Sheet1", i, 7, "Pass");
                Utilclass.fillGreencolor(filepath,"Sheet1",i,7);
            }
            else {
                System.out.println("Test cas has been failed");
                Utilclass.setCellData(filepath,"Sheet1",i,7,"Fail");
                Utilclass.fillREDcolor(filepath,"Sheet1",i,7);
            }


            Thread.sleep(2000);
            driver.findElement(By.xpath("//a[@onclick=\"javascript:reset_fdcalcfrm();\"]")).click();

        }

        driver.quit();
    }
}
