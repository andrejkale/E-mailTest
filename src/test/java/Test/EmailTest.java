package Test;

import Pages.MailPage;
import Pages.StatusPage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Andre on 10.09.2017.
 */
public class EmailTest extends BaseTest {
    @Test
    public void testEmail() throws Exception {
       app.login.loginValidUser();
        String userName = app.mailPage.getTextUserName();
        Assert.assertEquals(userName,"Андрей","Current user name " + userName + " is not correct");
    }


    @Test
    public void testCreateMail() throws Exception {
        app.login.loginValidUser();
        MailPage page = new MailPage();
        page.CreateMail();
        app.letter.sendNewMail();
        StatusPage statusPage = new StatusPage();
        statusPage.linkInboxClick();
        MailPage mailPage = new MailPage();
        String newInbox = mailPage.getNewInbox();
        Assert.assertEquals(newInbox,"i", "New mail is absent");



    }
}
