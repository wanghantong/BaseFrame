package com.ty.base.baseFrame;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseSeleniumTemplate {

	private WebDriver driver;

	@Test
	public void testMethod() {
		driver.get("http://blog.csdn.net/wanghantong/article/details/28897695");
	}

	@BeforeMethod
	public void beforeMethod() {
	}

	@AfterMethod
	public void afterMethod() {
	}

	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	@BeforeTest
	public void beforeTest() {

	}

	@AfterTest
	public void afterTest() {

	}
}
