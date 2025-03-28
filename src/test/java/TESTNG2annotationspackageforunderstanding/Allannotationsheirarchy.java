package TESTNG2annotationspackageforunderstanding;

import org.testng.annotations.*;

public class Allannotationsheirarchy {

    @BeforeSuite
    void bs(){
        System.out.println("This is the before suite method");
    }

    @AfterSuite
    void as(){
        System.out.println("This is the after suite method");
    }

    @BeforeTest
    void Bt(){
        System.out.println("this is the before test method");
    }

    @AfterTest
    void At(){
        System.out.println("this is the After test method");
    }


    @BeforeClass
    void bc(){
        System.out.println("This is the before class method");
    }

    @AfterClass
    void ac(){
        System.out.println("This is the after class method");
    }

    @BeforeMethod
    void bm(){
        System.out.println("This is the before method");
    }

    @AfterMethod
    void am(){
        System.out.println("This is the after method");
    }

    @Test(priority = 1)
    void test2(){
        System.out.println("This is the test 2  method");
    }

    @Test(priority = 2)
    void test1(){
        System.out.println("This is the test1  method");
    }
}
