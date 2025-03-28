package TestNG;

import org.apache.commons.io.filefilter.FalseFileFilter;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyOfTestNG {

        @Test(priority = 1)
                void openapp(){
            System.out.println("This method opens the application");
            Assert.assertTrue(true);
        }

        @Test(priority = 2, dependsOnMethods = {"openapp"})
                void login(){
            System.out.println("Logged in......");
            Assert.assertTrue(true);
        }

        @Test(priority = 3, dependsOnMethods = {"login"})
              void search(){
            System.out.println("Searching something....");
        }

    @Test(priority = 4, dependsOnMethods = {"login"})
    void advsearch(){
        System.out.println("Advance searching something...");
    }

    @Test(priority = 5, dependsOnMethods = {"login"})
    void logout(){
        System.out.println("Logout...");
    }
    }

