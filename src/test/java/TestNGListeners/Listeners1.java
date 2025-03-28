package TestNGListeners;

import org.apache.logging.log4j.core.util.JsonUtils;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;

public class Listeners1  implements ITestListener {


    public void onStart(ITestContext result) {
        System.out.println("On start listener");
    }

    public void onTestStart(ITestResult result)
    {
        System.out.println("ON Test start method");
    }

    public void  onTestSuccess(ITestResult result){
        System.out.println("ON Test success method is called");
    }


    public void onTestFailure(ITestResult result){
        System.out.println("ON Test failure this method is called");
    }

    public void onTestSkipped (ITestResult result){
        System.out.println("Test is skipped hehehhe");
    }

    public  void onFinish(ITestContext context){
        System.out.println("Called when method is finished");
    }


}
