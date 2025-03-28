package POMWithPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpagefatory {
    WebDriver driver;

    //Constructor
    Loginpagefatory(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }

    //Locators
    @FindBy(xpath = "//input[@placeholder='Username']") WebElement user_name;
    @FindBy( xpath="//input[@placeholder='Password']") WebElement pswd;
    @FindBy(xpath="//button[normalize-space()='Login']") WebElement btn;

    //Actions class

    public void setUsername(String user){
        user_name.sendKeys(user);
    }

    public void setPassword(String pass){
        pswd.sendKeys(pass);
    }

    public void clickOnLoginbutton(){
        btn.click();
    }
}

