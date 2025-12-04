package healthcare.testcases;

import org.testng.annotations.Test;

import healthcare.base.Basetest;
import healthcare.pages.Homepage;
import healthcare.pages.Loginpage;

public class TC001_login extends Basetest{
	
	@Test
	public void login() {
		
		logger.info("****************starting TC_001*****************");
		Homepage hp=new Homepage(driver);
		hp.toggle();
		hp.login();
		
		Loginpage lp=new Loginpage(driver);
		lp.User(prop.getProperty("id"));
		lp.Password(prop.getProperty("pass"));
		lp.Submit();
		logger.info("***************ending TC_001****************");
	}
}


