package Helpers;

import Pages.BasePage;

import java.util.concurrent.TimeUnit;

/**
 * Created by Andre on 16.09.2017.
 */
 public class CommonHelper extends BasePage {
   public void appOut(){
       driver.quit();
   }
   public void appBefore() throws InterruptedException {
      driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
   }
}
