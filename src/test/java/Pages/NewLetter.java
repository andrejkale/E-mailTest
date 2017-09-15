package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Andre on 14.09.2017.
 */
public class NewLetter extends BasePage {
	@FindBy(xpath="//*[@id='to']")
	private WebElement inputWhom;
	@FindBy(xpath="//input[@name='subject']")
	private WebElement inputSubject;
	@FindBy(xpath="//*[@id='text']")
	private WebElement inputText;
	@FindBy(xpath="//input[@class='bold']")
	private WebElement sndMail;

	public void sendMail(String whom, String subject, String text){
	    inputWhom.sendKeys(whom);
	    inputSubject.sendKeys(subject);
	    inputText.sendKeys(text);
	    sndMail.click();


    }




}

