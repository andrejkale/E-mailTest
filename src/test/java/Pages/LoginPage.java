package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.function.Function;

/**
 * Created by Andre on 10.09.2017.
 */
public class LoginPage extends BasePage {
	@FindBy(xpath="//input[@name='login']")
    private WebElement inputLogin;
	@FindBy(xpath = "//input[@name='pass']")
	private WebElement inputPassword;
	@FindBy(xpath = "//input[@tabindex='5']")
	private WebElement btnLogin;


    protected void login(String name, String password){
        logger.info(String.format("Login user name -%s, password -%s", name, password));
        inputLogin.sendKeys(name);
        inputPassword.sendKeys(password);
        btnLogin.click();
    }


}
