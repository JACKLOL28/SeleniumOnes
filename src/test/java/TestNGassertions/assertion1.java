package TestNGassertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assertion1 {

    @Test
    void testassertions() {
        String exp_value = "Optimal";
        String act_value = "Ontimal";

        //without assertion
//        if(exp_value==act_value){
//            System.out.println("Test case is passed");
//
//        }
//        else {
//            System.out.println("Test case is failed");
//        }
//    }

        //with assertion

//        Assert.assertEquals(exp_value,act_value);

        //With assertion using if else

//        if(exp_value==act_value){
//            System.out.println("Test case is passed");
//            Assert.assertTrue(true);
//
//        }
//        else {
//            System.out.println("Test case is failed");
//            Assert.assertTrue(false);
//        }


        //hard asserts

//        Assert.assertEquals(123,123);
//        Assert.assertEquals(123,"123");
//        Assert.assertNotEquals(1,2);
//        Assert.assertTrue(1==2);
//        Assert.assertFalse(1==2);

    }

    @Test
    void test_hardalerts() {
        System.out.println("Wow....");
        System.out.println("Testing.....");

        Assert.assertEquals(123, 456);

        System.out.println("Asserrt ke baad..");
        System.out.println("Kuch nai chalega....");
    }

    @Test(priority = 1)
    void test_softasserts() {
        System.out.println("Wow....");
        System.out.println("Testing.....");


        SoftAssert sa = new SoftAssert();
        sa.assertEquals(123, 456);
        System.out.println("Asserrt ke baad..");
        System.out.println("Kuch nai chalega....");

        sa.assertAll();
    }
}

