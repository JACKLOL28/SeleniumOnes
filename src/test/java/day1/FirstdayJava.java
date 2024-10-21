package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstdayJava {
    public static void main(String[] args) {

        //1.Launch browser
        WebDriver driver = new ChromeDriver();


        //2. Open the URL
        driver.get("https://www.opencart.com/index.php?route=cms/demo");

        //3.Maximize

        //4.Validate the title your store
        String title1=driver.getTitle();
        String expected_title="OpenCart-Demo";
        if(title1==expected_title){
            System.out.println("Wow titles are matching"+title1);
        }
        else {
            System.out.println("Titles are not matching "+title1);
        }

        //5.Quitting the driver
        driver.close();


    }
}
