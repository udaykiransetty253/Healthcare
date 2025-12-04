package healthcare.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends Baseinit{

	public Homepage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath="//a[@id=\"menu-toggle\"]")
	WebElement toggle;
	
	@FindBy(linkText="Login")
	WebElement Login;
	
	public void toggle() {
		toggle.click();
	}
	
	public void login() {
		Login.click();
	}
}
