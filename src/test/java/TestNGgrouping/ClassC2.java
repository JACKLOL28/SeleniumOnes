package TestNGgrouping;

import org.testng.annotations.Test;

public class ClassC2 {

    @Test(priority = 1 , groups = {"regression"})
    void signup(){
        System.out.println("Signing up..");
    }

    @Test(priority = 2, groups = {"regression"})
    void signupbyfb(){
        System.out.println("Signing up by fb..");
    }

    @Test(priority = 3, groups = {"regression"})
    void signupbytwitter(){
        System.out.println("Signing up by twitter..");
    }



}
