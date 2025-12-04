package healthcare.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Appointment extends Baseinit{
	public Actions actions;
	
	public Appointment(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(id="combo_facility")
	WebElement Facility;
	
	@FindBy(xpath="//option[contains(text(),'Tokyo CURA Healthcare Center')]")
	WebElement Tokyo;
	
	@FindBy(xpath="//option[contains(text(),'Hongkong CURA Healthcare Center')]")
	WebElement Hongkong;
	
	@FindBy(xpath="//option[contains(text(),'Seoul CURA Healthcare Center')]")
	WebElement Seoul;
	
	@FindBy(xpath="//input[contains(@id,'chk_hospotal')]")
	WebElement Readmissioncheckbox;
	
	@FindBy(xpath="//input[contains(@id,'radio_program_medicare')]")
	WebElement Medicarebutton;
	
	@FindBy(xpath="//input[contains(@id,'radio_program_medicaid')]")
	WebElement Medicaidbutton;
	
	@FindBy(xpath="//input[contains(@id,'None')]")
	WebElement Nonebutton;
	
	@FindBy(xpath="//input[@id='txt_visit_date']")
	WebElement Calender;
	
	@FindBy(xpath="//button[contains(@id,'btn-book')]")
	WebElement Bookappointment; 

	public void selectfacility() {
		Facility.click();
	}
	
	

	public void dropdown(String target) {
	switch(target) {
	case "Tokyo":Tokyo.click();
	break;
	case "Hongkong":Hongkong.click();
	break;
	case "Seoul":Seoul.click();
	break;
	default:System.out.println("invalid healthfacility");
	}
		
	}
	
	public void Checkbox() {
		Readmissioncheckbox.click();
	}
	
	public void Healthcaretype(String radiobutton) {
		switch(radiobutton) {
		case "medicare":Medicarebutton.click();
		break;
		case "mediaid":Medicaidbutton.click();
		break;
		case"none":Nonebutton.click();
		break;
		default:System.out.println("invalid button");
		break;
		}
	}
	
	public void Selectdate(String date) {
		Calender.sendKeys(date);
	}
	
	public void Book() {
		Bookappointment.click();
	}

	
}
