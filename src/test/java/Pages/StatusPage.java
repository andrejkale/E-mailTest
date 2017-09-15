package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Andre on 14.09.2017.
 */
public class StatusPage extends BasePage {
	@FindBy(css=".new>a")
	private WebElement inboxLink;

    public void linkInboxClick(){
        inboxLink.click();

    }
}
