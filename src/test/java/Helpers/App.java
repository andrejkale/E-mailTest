package Helpers;

import Pages.MailPage;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by Andre on 10.09.2017.
 */
public class App {
    public LoginHelper login = new LoginHelper();
    public MailHelper mailPage = new MailHelper();
    public CommonHelper common = new CommonHelper();
    public NewLetterHelper letter = new NewLetterHelper();
    public StatusPageHelper statusPage = new StatusPageHelper();
    public EmailHelper email = new EmailHelper();




}
