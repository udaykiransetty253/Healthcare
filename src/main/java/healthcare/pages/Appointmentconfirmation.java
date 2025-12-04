package healthcare.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Appointmentconfirmation extends Baseinit{

	public Appointmentconfirmation(WebDriver driver) {
		super(driver);

	}
	
	@FindBy(xpath="//div[@class='col-xs-12 text-center']/child::h2")
	WebElement confirm;

	public  String confirmation() {
		return confirm.getText();
	}
}
