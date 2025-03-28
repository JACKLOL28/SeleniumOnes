package TestNGgrouping;

import org.testng.annotations.Test;

public class PaymentTests {

    @Test(priority = 1 , groups = {"functional"})
    void paymenttest(){
        System.out.println("Now testing the payment");
    }

    @Test(priority = 2 , groups = {"functional"})
    void paymenttestbyfacebook(){
        System.out.println("Testing payment by facebook baba");
    }
}
