package Test;

import Pages.StatusPage;
import Utils.Email;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;

/**
 * Created by Andre on 10.09.2017.
 */
public class EmailTest extends BaseTest {
    @Test(priority = 3)
    public void testEmail() throws Exception {
       app.login.loginValidUser();
        String userName = app.mailPage.getTextUserName();

        Assert.assertEquals(userName,"Andrii","Current user name " + userName + " is not correct");
    }


    @Test(priority = 2)
    public void testCreateMail() throws Exception {
        app.login.loginValidUser();
        app.mailPage.CreateMail();
        app.letter.sendNewMail();
        app.statusPage.linkInboxClick();
        String newInbox = app.mailPage.getNewInbox();
        Assert.assertEquals(newInbox,"i", "New mail is absent");



    }

   /* @Test(priority = 1)
    public void testEmailCheck() throws Exception {
        app.login.loginValidUser();
        app.mailPage.CreateMail();
        app.letter.sendNewMail();
        app.statusPage.linkInboxClick();
        ArrayList <String> subject = new ArrayList<>();
         app.email.getSubjectMail().forEach(s -> subject.add(s.getText()));
        String expSubject = subject.get(0);
        Assert.assertEquals(expSubject, "Test");

    }*/

    @Test
    public void testArrayEmail() throws Exception {
        app.login.loginValidUser();
        app.mailPage.CreateMail();
        app.letter.sendNewMail();
        app.statusPage.linkInboxClick();
        ArrayList<Email> emails = new ArrayList<>();
        for (int i = 0; i <app.email.getSubjectMail().length() ; i++) {
            emails.add(new Email(app.email.getFromMail(),app.email.getSubjectMail(),app.email.getDateTimeMail()));

        }

            //System.out.println(emails);
        Email expSubject = emails.get(0);
        Assert.assertEquals(expSubject, "Test");





    }
}
