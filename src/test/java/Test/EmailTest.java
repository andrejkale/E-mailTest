package Test;

import Common.Constants;
import Pages.LoginPage;
import Pages.MailPage;
import Pages.NewLetter;
import Pages.StatusPage;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Driver;

/**
 * Created by Andre on 10.09.2017.
 */
public class EmailTest {
    @Test
    public void testEmail() throws Exception {

        LoginPage loginPage = new LoginPage();
        loginPage.login("andrejtest","sng777");
        MailPage mailPage = new MailPage();
        String userName = mailPage.getTextUserName();

        Assert.assertEquals(userName,"Андрей","Current user name " + userName + " is not correct");
    }

    @Test
    public void testCreateMail() throws Exception {
        LoginPage loginPage = new LoginPage();
        loginPage.login("andrejtest","sng777");
        MailPage page = new MailPage();
        page.CreateMail();
        NewLetter newLetter = new NewLetter();
        newLetter.sendMail("andrejtest@i.ua","Test","Hi, it is test");
        StatusPage statusPage = new StatusPage();
        statusPage.linkInboxClick();
        MailPage mailPage = new MailPage();
        String newInbox = mailPage.getNewInbox();
        Assert.assertEquals(newInbox,"i", "New mail is absent");



    }
}
