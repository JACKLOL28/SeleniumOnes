package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations1 {

    @BeforeMethod
    void login()
    {
        System.out.println("This is the login..");
    }

    @Test
    void search()
    {
        System.out.println("Searching something..");
    }

    @Test
    void advancedsearch()
    {
        System.out.println("Advance searching something");
    }

    @AfterMethod
    void logout()
    {
        System.out.println("Now finally loging out ...");
    }




}
