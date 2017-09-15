package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Andre on 10.09.2017.
 */
public class MailPage extends BasePage {

	@FindBy(xpath="//li[@class='ho_menu_item']/a/span")
	private WebElement textUserName;
	@FindBy(xpath="//div[1]/div[4]/ul/li[2]/a")
	private WebElement createMail;
	@FindBy(xpath="//i[@onclick='I_Mbox.ctrlMarkRead(this);']")
	private WebElement newMail;



	public String getTextUserName(){
	 return textUserName.getText();
    }
    public void CreateMail(){
		createMail.click();
	}
	public String getNewInbox(){
    	return newMail.getTagName();
	}



}
