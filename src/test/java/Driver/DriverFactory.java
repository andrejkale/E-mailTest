package Driver;

import Common.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Andre on 17.09.2017.
 */
 class DriverFactory {
   static WebDriver driver = null;
     static WebDriver getDriver(){
        String driverName = System.getProperty("driver");
        if ("firefox".equals(driverName)){
            System.setProperty("webdriver.gecko.driver","driver\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        else if("ie".equals(driverName)){
            System.setProperty("webdriver.ie.driver","driver\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }
        else if("edge".equals(driverName)){
            System.setProperty("webdriver.edge.driver","driver\\MicrosoftWebDriver.exe");
            driver = new EdgeDriver();
        }
        else if ("chrome".equals(driverName)){
            System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
            driver = new ChromeDriver();

        }
        else {
            System.setProperty("webdriver.gecko.driver","driver\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(Constants.BASE_URL);
        return driver;
    }
}
