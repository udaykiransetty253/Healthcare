package healthcare.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import healthcare.base.Basetest;
import healthcare.pages.Appointment;
import healthcare.pages.Appointmentconfirmation;
import healthcare.pages.Homepage;
import healthcare.pages.Loginpage;

public class TC_002_BookAppointment extends Basetest{
	
	@Test
	void bookappointment() {
		logger.info("****************starting TC-002*****************");
		logger.info("******Logging in********");
		Homepage hp=new Homepage(driver);
		hp.toggle();
		hp.login();
		
		Loginpage lp=new Loginpage(driver);
		lp.User(prop.getProperty("id"));
		lp.Password(prop.getProperty("pass"));
		lp.Submit();
		
	    logger.info("*******Booking Appointment***********");
		Appointment appoint=new Appointment(driver);
		appoint.selectfacility();
		appoint.dropdown(prop.getProperty("target"));
		appoint.Checkbox();
		appoint.Healthcaretype(prop.getProperty("radiobutton"));
		appoint.Selectdate(prop.getProperty("date"));
		appoint.Book();
		
		logger.info("*****Assertion of appiontment*****");
		Appointmentconfirmation ac=new Appointmentconfirmation(driver);
		String confirmation_txt=ac.confirmation();
		Assert.assertEquals( confirmation_txt,"Appointment Confirmation");
		logger.info("*******************Ending TC-002******************");
	}

}
