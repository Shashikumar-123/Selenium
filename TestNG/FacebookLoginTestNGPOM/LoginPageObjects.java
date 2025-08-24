package FacebookLoginTestNGPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects {

	@FindBy(id="email")
	private WebElement un_TF;
	@FindBy(id="pass")
	private WebElement psw_TF;
	@FindBy(id="email")
	private WebElement login_BTN;
	
	public LoginPageObjects(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Enter_UN()
	{
		un_TF.sendKeys("Admin");
	}
	public void Enter_PSW()
	{
		psw_TF.sendKeys("Admin@123");
	}
	public void ClickLogin()
	{
		login_BTN.sendKeys("Admin");
	}
}
