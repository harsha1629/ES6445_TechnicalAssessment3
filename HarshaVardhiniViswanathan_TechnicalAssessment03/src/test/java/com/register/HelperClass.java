package com.register;

import java.time.Duration;
import org.apache.logging.log4j.LogManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelperClass {
	private static WebDriver driver;
	public static org.apache.logging.log4j.Logger log;

	public static HelperClass helperclass;

	public HelperClass() {
		log = LogManager.getLogger(RegisterStepDefinition.class);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		log.info("Implicit wait applied");
		driver.manage().window().maximize();

	}

	public static void openingPage(String url) {
		driver.get(url);
	}

	public static WebDriver getdriver() {
		return driver;
	}
	
	public static void setUpDriver(){
		if(helperclass==null) {
			helperclass = new HelperClass();
		}
		
	}
	
	public static void tearDown() {
		if(driver!=null) {
			driver.close();
			driver.quit();
		}
	}

}
