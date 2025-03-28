package TESTNG2annotationspackageforunderstanding;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class c3 {

    @Test
    void fgh()
    {
        System.out.println("This is the third test method");
    }

    @BeforeSuite
    void bs()
    {
        System.out.println("This is the before suite method");
    }

    @AfterSuite
    void as(){
        System.out.println("This is after suite method");
    }

}
