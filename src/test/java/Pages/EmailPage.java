package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Andre on 12.10.2017.
 */
public class EmailPage extends BasePage {
    @FindBy(xpath="//*[@id='mesgList']/form/div[*]/a/span[3]/span")
    private WebElement subjectMail;
    @FindBy(xpath="//*[@id='mesgList']/form/div[*]/a/span[2]")
    private WebElement fromMail;
    @FindBy(xpath="//*[@id='mesgList']/form//a/span[1]/span")
    private WebElement dateTimeMail;

    public String getFromMail(){
        return fromMail.getText();
    }
    public String getSubjectMail(){
        return subjectMail.getText();
    }

    public String getDateTimeMail(){
        return dateTimeMail.getText();
    }
}
