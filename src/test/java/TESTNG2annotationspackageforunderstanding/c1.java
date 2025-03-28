package TESTNG2annotationspackageforunderstanding;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class c1 {

    @Test
    void abc()
    {
        System.out.println("This is the test class 1");
    }

    @BeforeTest
    void bt()
    {
        System.out.println("This is the before test");
    }

}
