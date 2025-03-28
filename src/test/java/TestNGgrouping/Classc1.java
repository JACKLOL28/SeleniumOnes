package TestNGgrouping;

import org.testng.annotations.Test;

public class Classc1 {

    @Test(priority = 1, groups = {"sanity"})
    void login(){
        System.out.println("login to application");
    }

    @Test(priority = 2, groups = {"sanity"})
    void loginByfb(){
        System.out.println("Login to application by facebook");
    }

    @Test(priority=3, groups = {"sanity"})
    void loginbytwitter(){
        System.out.println("Login by twitter");
    }
}
