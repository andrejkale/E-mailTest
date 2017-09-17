package Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Andre on 17.09.2017.
 */
public class DriverFactory {
   static WebDriver driver = null;
    public static WebDriver getDriver(){
        String driverName = System.getProperty("driver");
        if ("firefox".equals(driverName)){
            System.setProperty("webdriver.gecko.driver","driver\\geckodriver.exe");
            driver = new FirefoxDriver();
        } else {
            System.setProperty("webdriver.gecko.driver","driver\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();
        return driver;
    }
}
