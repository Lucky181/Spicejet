package com.crm.genericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.crm.objectRepository.HomePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver driver;
	public static WebDriver sdriver;
	public HomePage homepage;

	@BeforeSuite
	public void OpenConnection() throws Throwable {
		File_Utility.initializefile(IConstantPath.commondata);

	}
	@BeforeClass
	public void launchBrowser() throws Throwable {


		//File_Utility.fetchDataFromProperty("browser").equals("chrome");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		WebDriver_Utility.launchbrowser(driver, File_Utility.fetchDataFromProperty("url"),Java_Utility.convertStringtoLong(File_Utility.fetchDataFromProperty("timeout")));
		//sdriver=driver;
		
	}

	@BeforeMethod
	public void logintoApplication() throws Throwable {

		homepage=new HomePage(driver);
		homepage.loginApplication(File_Utility.fetchDataFromProperty("username"), File_Utility.fetchDataFromProperty("password"));
		Reporter.log("Succesfully login",true);
	}

	@AfterMethod
	public void logoutTheApplication() {
//		homepage.logoutApplication();
//		Reporter.log("Succesfully Loggedout",true);
	}

	@AfterClass
	public void closeTheBrowser() {
//		driver.quit();
//		Reporter.log("Succesfully allbrowsers is closed",true);
	}
	@AfterSuite
	public void closeTheAllConnections() {
//		Reporter.log("Succesfully closed all connections",true);
	}



}
