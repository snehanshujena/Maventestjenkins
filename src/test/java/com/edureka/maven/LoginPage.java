package com.edureka.maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPage {
	
	private WebDriver driver; 
	String appURL = "http://google.com";
	
	@BeforeClass
	public void testSetUp() {
		System.setProperty("webdriver.chrome.driver",
	            "C:\\Users\\sdas\\eclipse-workspace\\EdurekaMavenProject\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void verifyGooglePageTittle() {
		driver.navigate().to(appURL);
		String getTitle = driver.getTitle();
		Assert.assertEquals(getTitle, "Google");
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
