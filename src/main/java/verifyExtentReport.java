import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.google.common.annotations.VisibleForTesting;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by SMS-Pratibh on 12/14/2016.
 */
public class verifyExtentReport {

    ExtentReports report;
    ExtentTest logger;
    WebDriver driver;

    @org.junit.Test
    public void verifyLogin(){

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://goodworkbuzz.dev/#/login");
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("GWB | Login"));

    }



}
