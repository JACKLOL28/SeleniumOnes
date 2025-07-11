package WebDrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HandleBrowserWindows {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        Thread.sleep(3000);


        driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();

        Set<String> windowhandles = driver.getWindowHandles();
//
//        //Converting this from Set to List because In set it would be not be possible to perfom capturing each window id and perform action on it and also the order of Listing in not orderical
//
     List<String> windowList= new ArrayList(windowhandles);

    String parentId =windowList.get(0);
    String childIf= windowList.get(1);
    //Switching to childIDS

    driver.switchTo().window(childIf);
        System.out.println(driver.getTitle());

        //Switching to parrnt again
        driver.switchTo().window(parentId);
        System.out.println(driver.getTitle());

        //Approach 2 using for loop if there are multiple windowIDS then for each loop would be good to use
//        for(String wid:windowhandles)
//        {
//         String title=driver.switchTo().window(wid).getTitle();
//
//            if(title.equals("OrangeHRM")){
//                System.out.println(driver.getCurrentUrl());
//
//                driver.close();
//            }
//        }

    }
}
