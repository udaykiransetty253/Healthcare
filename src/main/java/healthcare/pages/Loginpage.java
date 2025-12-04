package healthcare.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends Baseinit{

	public Loginpage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="txt-username")
	WebElement username;
	
	@FindBy(id="txt-password")
	WebElement password;
	
	@FindBy(id="btn-login")
	WebElement submit;
	
	public void User(String id) {
		username.sendKeys(id);
	}
	
	public void Password(String pass) {
		password.sendKeys(pass);
	}
	
	public void Submit() {
		submit.click();
		
	}
}
