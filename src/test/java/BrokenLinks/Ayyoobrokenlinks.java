package BrokenLinks;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.tracing.opentelemetry.SeleniumSpanExporter;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class Ayyoobrokenlinks {
    public static void main(String[] args) throws MalformedURLException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");


        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        driver.get("http://www.deadlinkcity.com/");

        //First we need to take all the links like how much links are presnet we need to take all
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());
        int brokenlinks=0;

        for(WebElement linkElement:links) {
            //Now check if the href value is null if href is null then its not possible to find the link
            String hrefArtValue = linkElement.getAttribute("href");
            if (hrefArtValue == null || hrefArtValue.isEmpty()) {
                System.out.println("Not possible because href value is empty we wont be able to find the links");
                continue;//Will continue the code till last even if the condition failed
            }

            //hit URL to server
            //Now we need to convert it from string to URL
            try {

                URL linkurl = new URL(hrefArtValue);
                //Converting from string to URL so that it can hit the server and
                //get the response code
             HttpURLConnection connlinkurl=(HttpURLConnection) linkurl.openConnection();//this will open connection to server and returns an object;
                connlinkurl.connect();//Connects to the server

                if(connlinkurl.getResponseCode()>=400) {
                    brokenlinks++;
                    System.out.println(hrefArtValue + " It is a broken link");
                }
                else {
                    System.out.println(hrefArtValue + " It is not a broken link");
                }



            }
            catch (Exception e) {
            }

        }
        System.out.println("Number of broken links: "+brokenlinks);
        }

    }