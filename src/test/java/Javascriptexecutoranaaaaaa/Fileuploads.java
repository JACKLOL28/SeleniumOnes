package Javascriptexecutoranaaaaaa;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Fileuploads {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//        driver.get("https://qa-automation-practice.netlify.app/file-upload.html");

        driver.manage().window().maximize();

        // Singleupload
        driver.findElement(By.id("file_upload")).sendKeys("C:/Users/MMK-USER/Downloads/sample.pdf");
        driver.findElement(By.xpath("// button[@type='submit']")).click();
        String successtext = driver.findElement(By.id("file_upload_response")).getText();
        if (successtext.contains("You have successfully uploaded")) {
            System.out.println("The document has been uploaded");
        } else {
            System.out.println("The document has not been uploaded");
        }

        //Multi docs upload
//        String file1= "C:/Users/MMK-USER/Downloads/sample.pdf";
//        String file2= "C:/Users/MMK-USER/Downloads/sample.pdf";
//
//        driver.findElement(By.id("file_upload")).sendKeys(file1 + "\n" + file2 );
//        driver.findElement(By.xpath("// button[@type='submit']")).click();
//        String successtext = driver.findElement(By.id("file_upload_response")).getText();
//        if(successtext.contains("You have successfully uploaded")){
//            System.out.println("The document has been uploaded");
//        }
//        else
//        {
//            System.out.println("The document has not been uploaded");
//        }
//    }
//
    }
}
