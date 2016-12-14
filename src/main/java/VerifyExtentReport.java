import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import org.testng.annotations.Test;

import java.io.File;


/**
 * Created by SMS-Pratibh on 12/14/2016.
 */
public class VerifyExtentReport {


    ExtentReports report;
    ExtentTest logger;
    WebDriver driver;
    private static ExtentHtmlReporter htmlReporter;
    private static String filePath = "./extentreport.html";

    @Test
    public void verifyLogin(){

        report = new ExtentReports();
        report.attachReporter(getHtmlReporter());
        logger = report.createTest("First Test");


        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //logger.log(LogStatus.INFO,"Browser Started");
        driver.get("https://homnia.fi/info");
       /*Take Screenshot dynamically. This can be done in every step and every step.*/
        //Utility.captureScreenshot(driver, "homnia_homepage");
        //String title = driver.getTitle();
        //Assert.assertTrue(title.contains("Homnia"));
        driver.quit();
    }

    @AfterMethod
    public void tearDown(ITestResult result){
        //get test case status pass or fail
        if(ITestResult.FAILURE==result.getStatus()){
        //    String screenshot_path = Utility.captureScreenshot(driver, result.getName());
        //    ExtentTest log = logger.log(LogStatus.FAIL, "Title Verification", screenshot_path);
        }
    }

    private static ExtentHtmlReporter getHtmlReporter() {

        htmlReporter = new ExtentHtmlReporter(filePath);

        // make the charts visible on report open
        htmlReporter.config().setChartVisibilityOnOpen(true);

        htmlReporter.config().setDocumentTitle("QAV automation report");
        htmlReporter.config().setReportName("Regression cycle");
        return htmlReporter;
    }

}
