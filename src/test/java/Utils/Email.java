package Utils;

import Pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andre on 30.09.2017.
 */
public class Email extends BasePage {
    @FindBy(xpath="//div/a/span[3]/span")
    private List<WebElement> subjectMail;
    @FindBy(xpath="//div/a/span[2]")
    private List<WebElement> fromMail;
    @FindBy(xpath="//div/a/span[1]/span")
    private List<WebElement> dateTimeMail;

    public Email(List<WebElement> subjectMail, List<WebElement> fromMail, List<WebElement> dateTimeMail) {
        this.subjectMail = subjectMail;
        this.fromMail = fromMail;
        this.dateTimeMail = dateTimeMail;
    }

    public Email() {

    }



    @Override
    public String toString() {
        return "Email{" +
                "subjectMail=" + subjectMail +
                ", fromMail=" + fromMail +
                ", dateTimeMail=" + dateTimeMail +
                "} " + super.toString();
    }
}
