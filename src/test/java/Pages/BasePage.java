package Pages;

import Common.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Andre on 10.09.2017.
 */
 public abstract class BasePage {
  protected static WebDriver driver;
   static {
       System.setProperty("webdriver.gecko.driver","driver\\geckodriver.exe");
        driver = new FirefoxDriver();
       driver.get(Constants.BASE_URL);
   }

   public BasePage() {
        PageFactory.initElements(driver,this);
    }
}
