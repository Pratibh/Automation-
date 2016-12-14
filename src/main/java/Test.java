import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by SMS-Pratibh on 12/13/2016.
 */
public class Test {
    public static void main(String[] args) {

        // Create a new instance of the Firefox driver
        /* WebDriver firefoxDriver = new FirefoxDriver();*/

        // Create a new instance for Chrome Driver
        System.setProperty("webdriver.chrome.driver", "J:/AutomationDrivers/chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();

        //Launch google website
        //firefoxDriver.get("www.bing.com");
        chromeDriver.get("http://www.google.com");

        // Print a Log In message to the screen
        System.out.println("Successfully opened the website ");

        //Wait for 5 Sec
     /*
     try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the driverSystem.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        driver.quit();*/
    }

}

