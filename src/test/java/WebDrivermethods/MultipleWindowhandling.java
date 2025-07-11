package WebDrivermethods;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.*;

public class MultipleWindowhandling {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        driver.findElement(By.linkText("OrangeHRM, Inc")).click();

        Set<String> widowhandles = driver.getWindowHandles();
        System.out.println(widowhandles);

        //Now converting this from set to list as to run in oderical order and also in Set it not possinle to perform actions

//        List<String> listwindow= new ArrayList<String>(widowhandles);
//
//        String parentid = listwindow.get(0);
//    String  childId=listwindow.get(1);
//
//    //Switching to child
//        driver.switchTo().window(childId);
//        System.out.println(driver.getTitle());
//
//        //Switch to parent
//
//        driver.switchTo().window(parentid);
//        System.out.println(driver.getTitle());

        //Alternate approach
        for(String wh:widowhandles){
             String title = driver.switchTo().window(wh).getTitle();
             if(title.equals("OrangeHRM")){
                 System.out.println(driver.getCurrentUrl());
             }


        }

    }
}



