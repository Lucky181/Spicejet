package com.crm.genericUtility;

import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class WebDriver_Utility {
	
	public static void maximizebrowser(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	public static void deleteallcookies(WebDriver driver) {
		driver.manage().deleteAllCookies();
	}
	public static void pageloadtimeout(WebDriver driver,long timeouts) {
		driver.manage().timeouts().implicitlyWait(timeouts, TimeUnit.SECONDS);
	}
	public static void launchbrowser(WebDriver driver,String url,long timeout) {
		maximizebrowser(driver);
		deleteallcookies(driver);
		pageloadtimeout(driver, timeout);
		driver.get(url);
	}
	public static void customWait(WebDriver driver,long timeout,WebElement element,int pollingtime ) throws Throwable {
		int count=0;
		while(count<=timeout) {
			try {
				element.click();
				break;
			}catch(NoSuchElementException e) {
				Thread.sleep(pollingtime);
				count++;
			}
		}
	}
	
	public static void switchToWindow(WebDriver driver,String partialTitleText) {
		Set<String> allwid=driver.getWindowHandles();
		for (String ids : allwid) {
			driver.switchTo().window(ids);
			if(driver.getTitle().contains(partialTitleText)) {
				System.out.println(driver.getTitle());
				break;
			}
		}
	}
	
	
	
	
	
	
}