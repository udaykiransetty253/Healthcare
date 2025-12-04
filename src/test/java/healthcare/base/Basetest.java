package healthcare.base;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Basetest {
	
	    public WebDriver driver;
	    public Properties prop;
	    public Logger logger; 
	    
	    @BeforeMethod
	    public void setup() throws IOException {
	    	
	    	FileReader file=new FileReader("./resource/config.properties");
	    	prop=new Properties();
	    	prop.load(file);
	    	logger = LogManager.getLogger(Basetest.class);
	    	
	    	String Browser=prop.getProperty("browser");
	    	switch(Browser) {
	    	case "chrome": 
	    		ChromeOptions options = new ChromeOptions();
	    		options.addArguments("--incognito");
	    		driver = new ChromeDriver(options);
	    	break;
	    	
	    	case "edge":
	    		EdgeOptions options1=new EdgeOptions();
	    		options1.addArguments("--diasable-notifications");
	    		options1.addArguments("--disable-popups-blocking");
	    		driver=new EdgeDriver(options1);
	    	break;
	    	
	    	default:System.out.println("invalid browser");
	    	}
	   
	    	driver.manage().window().maximize();
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    	driver.get(prop.getProperty("url"));
	    	
	    }
	    @AfterMethod
	    public void teardown() {
	    	driver.quit();
	    	
	    }
	}



