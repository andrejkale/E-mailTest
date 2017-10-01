package Pages;

import Driver.MyDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Andre on 10.09.2017.
 */
 public abstract class BasePage {

  protected static WebDriver driver = MyDriver.getMyDriver();
    protected     Logger logger =  LogManager.getLogger(this.getClass());

  public BasePage() {
        PageFactory.initElements(driver,this);
    }
}
