package Helpers;

import Utils.Email;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by Andre on 30.09.2017.
 */
public class EmailHelper extends Email {
    public EmailHelper(List<WebElement> subjectMail, List<WebElement> fromMail, List<WebElement> dateTimeMail) {
        super(subjectMail, fromMail, dateTimeMail);
    }

    public EmailHelper() {
        super();
    }
}
