package TESTNG2annotationspackageforunderstanding;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class c2 {

    @Test
    void def(){
        System.out.println("This is the second test method");
    }

    @AfterTest
    void at(){
        System.out.println("This is the after test method");
    }
}
