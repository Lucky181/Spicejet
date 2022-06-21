package com.crm.spiceJetTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.crm.genericUtility.BaseClass;
import com.crm.objectRepository.HomePage;

public class Lucky extends BaseClass {

	public HomePage homepage;
	
	@Test
	public void test1() throws InterruptedException {
		
		Thread.sleep(4000);
		homepage=new HomePage(driver);
	    homepage.ClickOnRoundTrip();
		Thread.sleep(4000);
		
		
		

		
	}

}
