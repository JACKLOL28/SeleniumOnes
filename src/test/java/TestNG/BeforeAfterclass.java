package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeAfterclass {

    @BeforeClass
    void login()
    {
        System.out.println("Login re baba");
    }

    @Test(priority = 1)
     void search()
     {
         System.out.println("Ghammand mat kar");
     }

     @Test(priority = 2)
     void advancedsearch(){
         System.out.println("Advanced search method");
     }

     @AfterClass
     void logout(){
         System.out.println("This is logout");
     }

}
