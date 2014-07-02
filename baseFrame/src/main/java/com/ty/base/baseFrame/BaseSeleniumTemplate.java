package com.ty.base.baseFrame;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

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
