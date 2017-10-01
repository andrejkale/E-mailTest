package Test;

import Pages.StatusPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;

/**
 * Created by Andre on 10.09.2017.
 */
public class EmailTest extends BaseTest {
    @Test(priority = 2)
    public void testEmail() throws Exception {
       app.login.loginValidUser();
        String userName = app.mailPage.getTextUserName();

        Assert.assertEquals(userName,"Andrii","Current user name " + userName + " is not correct");
    }


    @Test(priority = 1)
    public void testCreateMail() throws Exception {
        app.login.loginValidUser();
        app.mailPage.CreateMail();
        app.letter.sendNewMail();
        app.statusPage.linkInboxClick();
        String newInbox = app.mailPage.getNewInbox();
        Assert.assertEquals(newInbox,"i", "New mail is absent");



    }


}
