package Actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Keyboardactions {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://text-compare.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//TEXTAREA[@name='text1']")).sendKeys("Hello vishay khatam jab name jack ho");

        Actions act = new Actions(driver);
        act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
        act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();

        //Npw tab
        act.keyDown(Keys.TAB).keyUp(Keys.TAB);

        //Now paste mama chowk pe nai tab pe
        act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();

        //if we want to switch to the new tab
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.globalsqa.com/demo-site/sliders/");

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
    }
}
